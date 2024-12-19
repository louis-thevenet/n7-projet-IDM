#import "./template/template.typ": *
#import "@preview/codelst:2.0.1": sourcecode

#show: project.with(
  subject: "Ingénierie Dirigée par les Modèles",
  title: "Projet IDM : chaiseMinute",
  authors: (
    "LEBOBE Timothé",
    "LECUYER Simon",
    "SABLAYROLLES Guillaume",
    "THEVENET Louis",
  ),
  date: "Novembre 2024 - Decembre 2024",
  subtitle: "Groupe L34-2",
  toc: true,
)

= Introduction
Ce projet consiste en la réalisation d'un environnement de calcul Domaine-Scientifique nommé : ChaiseMinute.

ChaiseMinute permet à tous ses utilisateurs de développer des `schémas de tables` et des `librairies` pour traiter automatiquement des données respectant ces schémas. Ainsi l'utilisateur pourra produire des outils pour d'autres utilisateurs finaux souhaitant manipuler des données sans avoir à créer leur propres outils.

L'utilisateur de `ChaiseMinute` dipose d'une syntaxe textuelle ainsi qu'un outil graphique permettant de définir ses schémas de tables. Les schémas de tables pourront être transformés dans des langages plus spécifiques au calcul pour pouvoir transformer et vérifier des données.

= Méta-Modèles
Nous avons décidé de séparer le modèle en trois sous-méta-modèles :
+ ChaiseMinute.Ecore
  - Point d'entrée, il permet de définir les schémas de table
+ Algorithm.Ecore
  - Définir les algorithmes utilisés pour les `ComputedColumns` et les `Constraints`
+ Function.Ecore
  - Pour spécifier les `Functions` utilisées par les `Algorithm`

== `ChaiseMinute`

#figure(
  image("./images/chaiseMinuteDiagram.svg", width: 100%),
  caption: [ChaiseMinute Ecore Diagram.],
) <chaiseMinuteDiagram>

- `ChaiseMinute` représente le container permettant de regrouper les schémas de tables entre eux.
- `Table` défini un schéma de table comme un ensemble de `Column` et d'une `IndexColumn`, des contraintes peuvent également être ajoutées pour vérifier les données d'entrée
- `IndexColumn` : est une colonne spéciale pour les index des lignes
- `Column` est une super-classe représentant une colonne, elle contient un type de données et d'éventuelles contraintes sur les données d'entrée ou de sortie
  - `ColumnData` : une colonne simple pour représenter une donnée,
  - `ImportedColumn` : une colonne provenant d'une autre `Table`,
  - `ComputedColumn` : représentant une colonne calculée avec un `Algorithm`

Toutes les contraintes sont représentées par des algorithmes qui renvoient un booléen.

Le méta-modèle seul ne permet pas d'éviter toute erreur que pourrait faire l'utilisateur lors de la conception d'un modèle. Nous avons donc mis en place un certains nombre de contraintes statiques décrites ci-dessous :
- *inv* NomValide : Le nom d'un `ChaiseMinute` doit être non null, non vide et respecter les conventions java
- *inv* NomCorrect : Le nom d'une `Table` doit respecter les mêmes conditions
- *inv* NomCorrect : Le nom d'une `Column` doit respecter les mêmes conditions
- *inv* Possede un type : Une `Column` doit posséder un type
- *inv* NomUniqueColumn : Une `Column` doit posséder un nom qui l'identifie dans la table
- *inv* CheminCorrect : Une `ImportedColumn` doit posséder un chemin d'accés valide vers la colonne qui est importée. C'est-à-dire que si la colonne est importée depuis une autre `Table` du `ChaiseMinute` le chemin doit être `<NomDeLaTable>.<NomDeLaColonne>`. Sinon, `<NomDeLaColonne>` car la colonne est dans la même table (duplication d'une colonne).
Il n'y a pas de contraintes statiques supplémentaire pour les `ColumnData`, et les `ComputedColumn`.

Dans ce projet, nous avons fournis dans `src/fr.n7.chaiseMinute.exemples/exemples_contraintes_statiques` deux exemples différents de modèle qui passent l'entièreté des contraintes statiques (nom commence par "ok"). Ainsi que 9 autres exemples qui ne passent pas les tests.


== `Algorithm`
#figure(
  image("./images/algorithmDiagram.svg", width: 60%),
  caption: [Algorithm Diagram.],
) <algorithDiagram>

`Algorithm` représente le point d'entrée d'un algorithme, il contient les fonctions qui seront appliquées.

L'application des fonctions respecte les règles suivantes :
- La première fonction est appliquée à ses arguments déclarés dans le modèle
- Les fonctions suivantes reçoivent en premier argument la sortie de la fonction précédente, puis leur arguments déclarés

Ces règles nous permettent de chaîner les fonctions dans un algorithme.

Nous n'avons pas établit de contraintes statiques sur ce modèle.

== `Function`
#figure(
  image("./images/functionDiagram.svg", width: 50%),
  caption: [Function Diagram.],
) <functionDiagram>

Une `Function` est représentée par un identifiant qui référence un programme Python, elle contient des arguments, qui sont des références vers des colonnes. Les colonnes sont représentées sous la forme `nomTable.nomColonne` dans tout le projet (pour les références croisées de @chaiseMinuteDiagram, les arguments de fonctions, etc).

Nous n'avons pas établit de contraintes statiques sur ce modèle.

=== Limitations
On aurait pu faire en sorte que les `Function` soient des arguments, ainsi on aurait pu construire un arbre d'appels et prendre la sortie de plusieurs fonctions à la fois en arguments. On peut quand même obtenir ce résultat avec le système actuel en adaptant les fonctions Python pour qu'elles renvoient plusieurs colonnes, ainsi en adaptant la fonction suivante pour qu'elle récupère ces deux colonnes, on imite le fonctionnement d'un arbre d'appels.

== `Calculus`
#figure(
  image("images/calculusv2Diagram.svg", width: 110%),
  caption: [Calculus Diagram.],
) <calculusDiagram>

`Calculus` représente le méta-modèle des fonctions/calculs éditables à l'aide d'une syntaxe graphique par un utilisateur. Un `Calculus` représente un ensemble de `CalculusElement` qui peuvent se décomposer en trois grandes parties : `UsableExpression`, `PipeSuper` et `FinalExpression`.

- `UsableExpression` décrit les expressions pouvant être appelées pour réaliser le calcul :
  - `InputArgs` pour les arguments en entrée du `Calculus`,
  - `Constante` pour décrire les constantes pouvant être écrite en dure dans les suites de calculs. Ces deux premiers ne peuvent que fournir des valeurs à l'intérieur du `Calculus` et donc n'ont pas d'expression en entrée,
  - `Operation` décrit une opération possible à l'intérieur du calcul, pouvant être à deux entrées (`BinaryExpression`) ou à une seule entrée (`UnaryExpression`)
- `PipeSuper` représente les liens entre les `UsableExpression` pour décrire l'odre des calculs et l'odre des appels : 
  - `Pipe` pour décrire les liens, les entrées et les sorties, entre les calculs,
  - `PipeFinal` indique que les calculs redirige vers la sortie finale, la donnée retournée du `Calculus`, 
- `FinalExpression` indique la fin du calcul.

=== Limitations 
Nous avons donné des opérations de calcul "classique" utilisable directement par l'utilisateur : `Sum`, `Substraction`, `Products`, `Division`, `Oppose` et `Reciprocal` mais nous aurions pu rajouter des opérations mathématiques plus avancées (sin, cos, exp, modulo, ...) ou juste définir des opérations unaire ou binaire en les décrivants par un argument `opération`.  

Les `Pipe` sont utiles car il permettent de définir des expressions pendantes non reliées qui sont facilement éditables ensuite mais cela rajoute du poids sur l'architecture du méta-modèles qui nous pourrions corriger dans une version future.


= Transforamtions Texte à Modèle de `ChaiseMinute`
== Syntaxe Textuelle
En utilisant le langage Xtext, nous avons pu définir une syntaxe textuelle pour les schémas de tables comme suit :
#sourcecode(```
nomSchemaTable {
  nomTable1 (
    nomColonne1 of typeColonne1,
    nomColonne2 of typeColonne2,
    nomColonne3 of typeColonne3 computed with [
      nomFonction1("nomTable1.nomColonne1", "nomTable1.nomColonne2") >
      nomFonction2(nomTable1.nomColonne2)
    ]
  )
  constrained by [nomFonction3("nomTable1.nomColonne1", "nomTable1.nomColonne2")]

  nomTable2 (
    nomColonne1 of typeColonne1 imported from nomTable1.nomColonne1
  )
}
constrained by [nomFonction4("nomTable2.nomColonne1" "nomTable1.nomColonne2")]
```)

La syntaxe permet de définir des modèles de Table dans un méta-modèles proche de `ChaiseMinute` mais néamoins différent : `TabouretSeconde`. En effet, Xtext ne supportant pas certaines spécificités des ecore, comme les e-references, il est nécéssaire d'effecter une transformation M2M pour obtenir un modèle de `ChaiseMinute` à partir d'un modèle conforme à `TabouretSeconde`.

= Transformation Modèle à Modèle

Pour finaliser la transformation texte à modèle, nous avons écrit une transformation modèle à modèle en Acceleo (la `menuiserie`) qui consiste simplement à rétablir les e-references et avoir un modèle conforme à `ChaiseMinute`.


= Transformations Modèle à Texte
== Librairie et script de calcul automatique
Nous avons décidé d'utiliser le language Python pour nos algorithmes. Ainsi, pour générer une librarie de calcul à partir d'un schéma de table, il nous suffit de générer un programme Python qui appelle les fonctions référencées par les algorithmes et les contraintes.

La librarie propose différentes fonctions pour manipuler des données à l'aide du schéma de table.
#figure(caption: [Signatures des fonctions de la librarie])[#sourcecode()[```python
    def load(files):
    	"""Load all tables as CSV files. All tables must have a corresponding CSV file with the same name in working dir."""

    def check_constraints(input):
    	"""Ensure all contraints are respected in input and output data"""

    def generate_output(input):
    	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""

    def save_to_csv(tables):
    	"""Saves each table from he input argument as a CSV file."""


    def main():
    	input = load(sys.argv[1:])
    	out = generate_output(input)
    	res, msg = check_constraints(input)
    	print(msg)
    	save_to_csv(out)
    	print("Exported files")
    ```]
]


Nous générons aussi une fonction `main` dans notre librarie qui prend en entrée des fichier au format CSV et qui en génèrent de nouveaux en appliquant le schéma de table, résultant en un script de transformation automatique des données.

== Outil de visualisation des données
En s'appuyant sur la même librarie, on crée un outil de visualisation du schéma de table en Python. (Voir @equation_vis)

= Edition graphique
== `ChaiseMinute`
Nous avons développé un outils graphique permettant de modifier des fichiers _.cml_ (`ChaiseMinute`) pour modifier les différents `schémas de tables` et obtenir une visualisation plus pratique pour l'utilisateur.

Les `Tables` et les `Columns` sont visualisées comme des `containers`, des boîtes, pour montrer l'imbrication des `Columns` dans les `Tables` et la fraternités des `Columns`.
- Les `Tables` sont représentées par des `containers` verts clairs,
- Les `IndexColumn` sont représentées par des `containers` bleus clairs,
- Les `DataColumn` sont représentées par des `containers` rouges clairs,
- Les `ImportedColumn` sont représentées par des `containers` violets clairs,
- Les `ComputedColumn` sont représentées par des `containers` jaunes,
- Les `Algorithm` sont représentés par des `containers` marrons dans les `ComputedColumn`
  - Les informations dans les `containers Algorithm` affichent le nom des `Functions` qu'ils utilisent.

#figure(
  image("./images/exempleCompliqueSiriusDiagram.svg", width: 100%),
  caption: [Sirius de ExempleComplique.cml.],
) <exempleCompliqueSiriusDiagram>


== Limitation
Il est possible pour l'utilisateur de rajouter des fonctions utiles pour une `ComputedColumn`. Cependant nous avons rencontré des difficultés à choisir des fonctions inutile. En effet, nous ajoutons et enlevons les fonctions en écrivant leur chemin dans une boite de dialogue texte mais pour l'enlever nous n'avons pas réussi à utiliser la valeur renvoyée pour vérifier si elle correspondait à une `Function` présente et donc la supprimer en conséquence.

== `Calculus`
Les fichiers _.clc_, pour `Calculus`, sont éditables dans Sirius et sont donc plus facilement personnalisables pour les utilisateurs.

Les `UsableExpression` et `FinalExpression` sont représentés par des _Node_ et les `Pipes` comme des _Element Based Edge_ : 
- Les `InputArgs` en blanc,
- Les `Constante` en orange clair avec leur _value_,
- Les `BinaryExpression` en vert clair, 
- Les `UnaryExpression` en bleu clair, 
- Les `Pipe` et les `PipeFinal` en gris clair, 
- Les `FinalExpression` en bleu clair.

Les noms sur les _Nodes_ ou les _Edges_ représentent les arguments _name_ des `CalculusElement` associé.  

#figure(
  image("/images/meanFromCalculus.svg", width: 100%),
  caption: [Sirius de Mean.clc.],
) <meanSiriusDiagram>

== Limitation et améliorations
Dans l'état actuel de notre représentation graphique, nous pouvons définir et créer n'importe quel `CalculusElement` avec la palette de création. Cependant, nous n'arrivons pas pour les `BinaryExpression` à _Set_ uniquement la valeur de `beforeSecond` lorsqu'un lien est déjà présent. En effet, quand nous relions un deuxième `Pipe`, celui-ci remplace les valeurs de `before` et `beforeSecond`. Nous avons isolé la partie et compris d'où venait le problème (INSERER UN SCREEN DU .ODESIGN DES IF) et n'arrivons pas à implémenter un _if else_ convenable mais nous travaillons dessus.

Une piste d'amélioration de ce problème serait de créer des _Bordered Nodes_ indiquant le `before` et `beforeSecond` pour les `BinaryExpression` pour isoler le `Pipe` à modifier et ainsi résoudre notre problème. Dans la même idée, rajouter des _Bordered Nodes_ pour chaque entrée (`before`/`beforeSecond`) et sortie (`targetPipe`) pour visualiser correctement le nombre d'E/S nécessaire par expression.


= Exemples
== Equation du second degré
=== Modèle `TabouretSeconde` (syntaxe textuelle)
On utilise un schéma de table qui représente des polynômes du second degré dont on cherche les racines.
Les données d'entrée sont un fichier CSV qui contient une colonne par coefficient ($a$, $b$, $c$).

#figure(caption: "Description textuelle du schéma de table")[#sourcecode()[```ocaml
    exemple_equations {
            equations indexed on Index of Int(
            Solution of String computed with [
            	compute_delta("equations.a","equations.b", "equations.c")
            	> solve("equations.a","equations.b", "equations.c")
            ],
            delta of Int computed with [
            	compute_delta("equations.a","equations.b", "equations.c")
            ],
            a of Int imported from "table.a",
            b of Int imported from "table.b",
            c of Int imported from "table.c"
            )
    }
    constrained by [ensure_is_not_null("table.a") ]
    ```]
]
Les colonnes $a$, $b$ et $c$ sont importées de la table d'entrée.

Le schéma de table spécifie deux nouvelles colonnes `Solution` et `delta` qui représentent les racines et les déterminants de chaque polynôme.
Elles sont produites à partir des fonctions `compute_delta` et `solve`.

#sourcecode()[```python
  import numpy as np

  def compute_delta(a,b,c):
      return np.multiply(b,b) - 4 * np.multiply(a, c)

  ```
]
#sourcecode()[```python
  import numpy as np
  import math

  def solve(deltas, a,b,c):
      solutions = []
      for i in range(len(a)):

          if deltas[i] > 0:
              sqrt_delta = math.sqrt(deltas[i])
              solutions.append([
                (-b[i] - sqrt_delta)/(2*a[i]),
                (-b[i] + sqrt_delta)/(2*a[i])
              ])
          elif deltas[i] < 0:
              solutions.append(["No solution"])
          else:
              solutions.append([-b[i] / (2*a[i])])
      return solutions
  ```]


Finalement, une contrainte est vérifiée sur la colonne $a$, dont tous les éléments doivent être non nuls.
#sourcecode()[```python

  import numpy as np

  def ensure_is_not_null(x):
      return (np.array(x) != 0).all()
  ```]

=== Modèle `ChaiseMinute`
On transforme ensuite ce modèle intermédiaire en `ChaiseMinute` par notre transformation ATL `cmtToCm`

#figure(
  image("./images/equation_model.svg"),
  caption: [Modèle `chaiseMinute` obtenu vu sous Sirius],
)

=== Génération de la librarie Python

On génère ensuite la librarie via la transformation modèle vers texte, un extrait est disponible ci-dessous.

La fonction `generate_output` applique le schéma de table à partir des données chargées en entrée.
#sourcecode()[```python
  def generate_output(input):
  	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
  	tables = {}
  	out = {}
  	###########################################################################
  	# Table: equations
  	###########################################################################
  	### Imported column: a from table.a ###
  	out["a"]=input["table"]["a"]

  	### Imported column: b from table.b ###
  	out["b"]=input["table"]["b"]

  	### Imported column: c from table.c ###
  	out["c"]=input["table"]["c"]

  	################################
  	## Computed column: Solution
  	################################
  	### Apply compute_delta ##
  	from compute_delta import compute_delta
  	out["Solution"] = compute_delta(
  		search(input, out, "equations", "a"),
  		search(input, out, "equations", "b"),
  		search(input, out, "equations", "c"),
  	)
  	###############
  	### Apply solve ##
  	from solve import solve
  	out["Solution"] = solve(
  		out["Solution"], # Previous result used in next function
  		search(input, out, "equations", "a"),
  		search(input, out, "equations", "b"),
  		search(input, out, "equations", "c"),
  	)
  	###############
  	################################
  	## Computed column: delta
  	################################
  	### Apply compute_delta ##
  	from compute_delta import compute_delta
  	out["delta"] = compute_delta(
  		search(input, out, "equations", "a"),
  		search(input, out, "equations", "b"),
  		search(input, out, "equations", "c"),
  	)
  	###############
  	tables["equations"] = out

  	return tables
  ```]
La fonction `check_constraints` applique les contraintes et vérifie la cohérence des types.
#sourcecode()[```python
    def check_constraints(input):
    	"""Ensure all contraints are respected in input and output data"""
    	################################
    	# Verifying Input Constraints
    	################################
    	### Apply ensure_is_not_null ##
    	from ensure_is_not_null import ensure_is_not_null
    	res = ensure_is_not_null(
    		input["table"]["a"].to_list(),
    	)

    	if not res:
    		return (False,("ensure_is_not_null constraints failed"))

    	################################
    	# Verifying Table Constraints
    	################################
    	out = generate_output(input)

    	### Verify data types
    	for x in out["equations"]["Solution"]:
    		break
    	for x in out["equations"]["delta"]:
    		if (type(x)!=int and type(x)!=numpy.int64):
    			return (False, "Type constraints failed on equations.delta")

    	for x in out["equations"]["a"]:
    		if (type(x)!=int and type(x)!=numpy.int64):
    			return (False, "Type constraints failed on equations.a")

    	for x in out["equations"]["b"]:
    		if (type(x)!=int and type(x)!=numpy.int64):
    			return (False, "Type constraints failed on equations.b")

    	for x in out["equations"]["c"]:
    		if (type(x)!=int and type(x)!=numpy.int64):
    			return (False, "Type constraints failed on equations.c")


    	return (True, "Constraints are respected")
  ```]
=== Application de la librarie
On peut finalement appeler le script automatique (fonction `main` de la librarie), qui à partir des données d'entrée au format CSV :

#table(
  columns: 4,
  ..csv("./images/input_equations.csv").flatten()
)

Produit le fichier :

#table(
  columns: 6,

  ..csv("./images/output_equations.csv").flatten()
)


On peut également voir les données dans l'outil de visualisation généré

#figure(
  caption: [Visualisation des données générées],
  image("./images/equation_visualizer.png"),
) <equation_vis>

= Conclusion
//  qui doit inclure un bilan sur le projet (soit personnel soit de groupe), expliquant notamment les points de difficulté, et si possible une critique sur le sujet proposé

= Annexes
//Une description détaillée de ce que contient le rendu (cf Section 4) : description succincte de chaque projet et des fichiers importants (méta-modèles, modèles exemple, fichiers de description, scripts, etc.)

== Workspaces `ChaiseMinute`
== Workspaces `Calculus`
== Workspaces Sirius
== Workspaces Exemples