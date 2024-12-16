package chaiseMinute.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import chaiseMinute.ChaiseMinute;
import chaiseMinute.Column;
import chaiseMinute.ColumnData;
import chaiseMinute.ComputedColumn;
import chaiseMinute.ImportedColumn;
import chaiseMinute.Table;
import chaiseMinute.util.ChaiseMinuteSwitch;


/**
 * Réalise la validation d'un EObject issu de ChaiseMinute (en théorie, d'un tableur).
 * Cet classe visite le modèle et utilise les caseXXX pour rediriger l'algo vers la
 * bonne méthode.
 * Attention, lorsqu'une classe est un parent il faut aller faire la visite des enfants
 * manuellement.
 * 
 * La classe Switch exige un paramètre de généricité (et gère une partie de la visite à
 * base de comparaison à null). Ici le paramètre est un booléen mais en réalité on ne
 * s'en sert pas...
 * 
 * @author Timothé Lebobe & Guillaume Sablayrolles & Simon Lécuyer & Louis Thevenet
 * @version 0.1
 */
public class ChaiseMinuteValidator extends ChaiseMinuteSwitch<Boolean> {
	/**
	 * Expression régulière qui correspond à un identifiant bien formé.
	 */
	private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";
	
	/**
	 * Résultat de la validation (état interne réinitialisé à chaque nouvelle validation).
	 */
	private ValidationResult result = null;
	
	/**
	 * Construire un validateur
	 */
	public ChaiseMinuteValidator() {}
	
	/**
	 * Lancer la validation et compiler les résultats dans un ValidationResult.
	 * Cette méthode se charge de créer un résultat de validation vide puis de
	 *  visiter les process présents dans la ressource.
	 * @param resource resource à valider
	 * @return résultat de validation
	 */
	public ValidationResult validate(Resource resource) {
		this.result = new ValidationResult();
		
		for (EObject object : resource.getContents()) {
			this.doSwitch(object);
		}
		
		return this.result;
	}


	/**
	 * Méthode appelée lorsque l'objet visité est une ChaiseMinute.
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseChaiseMinute(ChaiseMinute object) {
		// Contraintes sur ChaiseMinute
		// inv NomValide
		this.result.recordIfFailed(
				object.getName() != null 
				&& object.getName().length() > 0
				&& object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la ChaiseMinute ne respecte pas les conventions Java");
		
		// Visite
		for (Table table : object.getTables()) {
			this.doSwitch(table);
		}
		
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Table.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseTable(Table object) {
		// inv NomCorrect
		this.result.recordIfFailed(
				object.getName() != null && object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la Table ne respecte pas les conventions Java");
		
		// Visite
		for (Column column : object.getColumns()) {
			this.doSwitch(column);
		}
		this.doSwitch(object.getIndexColumn());
		
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une Column (ou un sous type).
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColumn(Column object) {
		// inv NomCorrect
		this.result.recordIfFailed(
				object.getId() != null && object.getId().matches(IDENT_REGEX), 
				object, 
				"Le nom de la Column ne respecte pas les conventions Java");
		
		// inv PossedeUnType
		this.result.recordIfFailed(object.getType() != null,
				object,
				"Le type doit être spécifié");
		
		// inv NomUniqueColumn
		this.result.recordIfFailed(object.getTable().getColumns().stream()
				.filter(c -> c != object && c.getId().equals(object.getId())).count() <= 0,
				object,
				"Le nom de la colonne doit être unique dans la table.");
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une ColumnData.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColumnData(ColumnData object) {
		// Contraintes sur ColumnData
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une ImportedColumn.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseImportedColumn(ImportedColumn object) {
		// Contraintes sur ImportedColumn
		
		// inv CheminCorrect
		String path = object.getPath();
		if (!path.contains(".")) {
			this.result.recordIfFailed(object.getTable().getColumns().stream()
					.filter(c -> c.getId().equals(path)).count() == 1,
					object,
					"Le nom de la colonne est invalide : " + path);
		} else {
			String[] ps = path.split("\\.");
			try {
				
				String table = ps[0];
				String column = ps[1];
				this.result.recordIfFailed(object.getTable().getChaiseMinute().getTables().stream()
						.filter(t -> 
							t.getName().equals(table)
							&& t.getColumns().stream()
								.filter(c -> c.getId().equals(column)).count() == 1).count() == 1, 
						object,
						"Le nom de la table ou de la colonne est invalide : " + path);
			} catch (Exception e) {
				this.result.recordIfFailed(false, 
						object,
						"Error process when path = " + path + "exception : " + e.getMessage());
			}
		}
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une ComputedColumn.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseComputedColumn(ComputedColumn object) {
		// Contraintes sur ComputedColumn
		return null;
	}

	/**
	 * Cas par défaut, lorsque l'objet visité ne correspond pas à un des autres cas.
	 * Cette méthode est aussi appelée lorsqu'une méthode renvoie null (comme une sorte de
	 * fallback).
	 * On pourrait implémenter le switch différemment, en ne renvoyant null dans les autres
	 * méthodes que si la contrainte ne sert à rien, et se servir de cette méthode pour
	 * identifier les éléments étrangers (qui de toute façon ne doivent pas exister).
	 * C'est aussi la méthode appelée si on ne redéfini pas un des caseXXX.
	 * @param object objet visité
	 * @return résultat, null ici
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		return null;
	}
	
	
}
