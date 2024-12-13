package function.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import function.Argument;
import function.ColumnArgument;
import function.Function;
import function.util.FunctionSwitch;


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
public class FunctionValidator extends FunctionSwitch<Boolean> {
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
	public FunctionValidator() {}
	
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
	 * Méthode appelée lorsque l'objet visité est un Argument (ou un sous type).
	 * Cet méthode amorce aussi la visite des éléments enfants.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseArgument(Argument object) {
		// Contraintes sur Argument
		return null;
	}

	/**
	 * Méthode appelée lorsque l'objet visité est une Function.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseFunction(Function object) {
		// inv NomCorrect
		this.result.recordIfFailed(
				object.getName() != null 
				&& object.getName().matches(IDENT_REGEX), 
				object, 
				"Le nom de la Table ne respecte pas les conventions Java");
		
		// visites des Arguments
		for (Argument arg : object.getInputs()) {
			this.doSwitch(arg);
		}
		return null;
	}
	
	/**
	 * Méthode appelée lorsque l'objet visité est une ColumnArgument.
	 * @param object élément visité
	 * @return résultat de validation (null ici, ce qui permet de poursuivre la visite
	 * vers les classes parentes, le cas échéant)
	 */
	@Override
	public Boolean caseColumnArgument(ColumnArgument object) {
		// inv NomCorrect
		this.result.recordIfFailed(
				object.getColumnPath() != null
				&& object.getColumnPath().length() > 0
				&& object.getColumnPath().matches(IDENT_REGEX), 
				object, 
				"Le nom de la Column ne respecte pas les conventions Java");		
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
