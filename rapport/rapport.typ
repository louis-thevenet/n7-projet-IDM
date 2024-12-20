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
Ce projet consiste en la réalisation d'un environnement de calcul Domaine-Scientifique nommé `ChaiseMinute` (c'est un tableur).

`ChaiseMinute` permet à tous ses utilisateurs de développer des `schémas de tables` et des `librairies` pour traiter automatiquement des données respectant ces schémas.
Ainsi l'utilisateur pourra produire des outils pour d'autres utilisateurs finaux souhaitant manipuler des données sans avoir à créer leur propres outils.

L'utilisateur de `ChaiseMinute` dipose d'une syntaxe textuelle ainsi qu'un outil graphique permettant de définir ses schémas de tables.
Les schémas de tables pourront être transformés dans des langages plus spécifiques au calcul pour pouvoir transformer, vérifier et visualiser des données.

= Méta-Modèles
Nous avons décidé de séparer le modèle en trois sous-méta-modèles :
+ `ChaiseMinute.Ecore`
  - Point d'entrée, il définit les schémas de table
+ `Algorithm.Ecore`
  - Définit les algorithmes utilisés pour les colonnes calculées et les contraintes
+ `Function.Ecore`
  - Pour spécifier les fonctions utilisées par les algorithmes

== `ChaiseMinute`

#figure(
  image("./images/chaiseMinuteDiagram.svg", width: 100%),
  caption: [ChaiseMinute Ecore Diagram.],
) <chaiseMinuteDiagram>

- `ChaiseMinute` représente le container permettant de regrouper les schémas de tables entre eux.
- `Table` définit un schéma de table comme un ensemble de `Column` et d'une `IndexColumn`, des contraintes peuvent également être ajoutées pour vérifier les données d'entrée
- `IndexColumn` : est une colonne spéciale pour les index des lignes
- `Column` est une super-classe représentant une colonne, elle contient un type de données et d'éventuelles contraintes sur les données d'entrée ou de sortie
  - `ColumnData` : une colonne simple pour représenter une donnée,
  - `ImportedColumn` : une colonne provenant d'une autre `Table`,
  - `ComputedColumn` : représentant une colonne calculée avec un `Algorithm`

Toutes les contraintes sont représentées par des algorithmes qui renvoient un booléen.

Le méta-modèle seul ne permet pas d'éviter toute erreur que pourrait faire l'utilisateur lors de la conception d'un modèle. Nous avons donc mis en place un certains nombre de contraintes statiques décrites ci-dessous :
/ `NomValide`: Le nom d'un `ChaiseMinute` doit être ni vide ni `null`, et respecter les conventions java
/ `NomCorrect`: Le nom d'une `Table` doit respecter les mêmes conditions
/ `NomCorrect`: Le nom d'une `Column` doit respecter les mêmes conditions
/ `Typé`: Une `Column` doit posséder un type
/ `NomUniqueColumn`: Une `Column` doit posséder un nom qui l'identifie dans la table
/ `CheminCorrect`: Une `ImportedColumn` doit posséder un chemin d'accés valide vers la colonne qui est importée. C'est-à-dire que si la colonne est importée depuis une autre `Table` du `ChaiseMinute` le chemin doit être `<NomDeLaTable>.<NomDeLaColonne>`. Sinon, `<NomDeLaColonne>` car la colonne est dans la même table (duplication d'une colonne).
Il n'y a pas de contraintes statiques supplémentaire pour les `ColumnData`, et les `ComputedColumn`.


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


== `Function`
#figure(
  image("./images/functionDiagram.svg", width: 50%),
  caption: [Function Diagram.],
) <functionDiagram>

Une `Function` est représentée par un identifiant qui référence un programme Python, elle contient des arguments, qui sont des références vers des colonnes. Les colonnes sont représentées sous la forme `nomTable.nomColonne` dans tout le projet (pour les références croisées de @chaiseMinuteDiagram, les arguments de fonctions, etc).

=== Limitations
On aurait pu faire en sorte que les `Function` soient des arguments, ainsi on aurait pu construire un arbre d'appels et prendre la sortie de plusieurs fonctions à la fois en arguments. On peut quand même obtenir ce résultat avec le système actuel en adaptant les fonctions Python pour qu'elles renvoient plusieurs colonnes, puis en adaptant la fonction suivante pour qu'elle récupère ces deux colonnes, on imite le fonctionnement d'un arbre d'appels.

== `Calculus`
#figure(
  image("images/calculusv2Diagram.svg", width: 110%),
  caption: [Calculus Diagram.],
) <calculusDiagram>

`Calculus` représente le méta-modèle des fonctions/calculs éditables à l'aide d'une syntaxe graphique par un utilisateur. Un `Calculus` représente un ensemble de `CalculusElement` qui peuvent se décomposer en trois grandes parties : `UsableExpression`, `PipeSuper` et `FinalExpression`.

- `UsableExpression` décrit les expressions pouvant être appelées pour réaliser le calcul :
  - `InputArgs` pour les arguments en entrée du `Calculus`,
  - `Constante` pour décrire les constantes pouvant être écrites en dure dans les suites de calculs. Ces deux premiers ne peuvent que fournir des valeurs à l'intérieur du `Calculus` et donc n'ont pas d'expression en entrée,
  - `Operation` décrit une opération possible à l'intérieur du calcul, pouvant être à deux entrées (`BinaryExpression`) ou à une seule entrée (`UnaryExpression`)
- `PipeSuper` représente les liens entre les `UsableExpression` pour décrire l'odre des calculs et l'odre des appels :
  - `Pipe` pour décrire les liens, les entrées et les sorties, entre les calculs,
  - `PipeFinal` indique que les calculs redirigent vers la sortie finale, la donnée retournée du `Calculus`,
- `FinalExpression` indique la fin du calcul.

=== Limitations
Nous avons donné des opérations de calcul "classique" utilisable directement par l'utilisateur : `Sum`, `Substraction`, `Products`, `Division`, `Oppose` et `Reciprocal` mais nous aurions pu rajouter des opérations mathématiques plus avancées (sin, cos, exp, modulo, ...) ou juste définir des opérations unaire ou binaire en les décrivants par un argument `opération`.

Les `Pipe` sont utiles car il permettent de définir des expressions pendantes non reliées qui sont facilement éditables ensuite mais cela rajoute du poids sur l'architecture du méta-modèles qui nous pourrions corriger dans une version future.


= Transforamtions Texte à Modèle de `ChaiseMinute`
== Syntaxe Textuelle
En utilisant le langage Xtext, nous avons pu définir une syntaxe textuelle pour les schémas de tables comme suit :
#sourcecode(```rust
nomSchemaTable {
  nomTable1 (
    nomColonne1 of typeColonne1,
    nomColonne2 of typeColonne2,
    nomColonne3 of typeColonne3 computed with [
      nomFonction1("nomTable1.nomColonne1", "nomTable1.nomColonne2")
      > nomFonction2(nomTable1.nomColonne2)
    ]
  )
  constrained by [nomFonction3("nomTable1.nomColonne1", "nomTable1.nomColonne2")]

  nomTable2 (
    nomColonne1 of typeColonne1 imported from nomTable1.nomColonne1
  )
}
constrained by [nomFonction4("nomTable2.nomColonne1" "nomTable1.nomColonne2")]
```)

La syntaxe permet de définir des modèles de Table dans un méta-modèles proche de `ChaiseMinute` mais néanmoins différent : `TabouretSeconde`. En effet, Xtext ne supportant pas certaines spécificités des modèles Ecore, comme les e-references, il est nécéssaire d'effecter une transformation M2M pour obtenir un modèle de `ChaiseMinute` à partir d'un modèle conforme à `TabouretSeconde`.

= Transformation Modèle à Modèle

Pour finaliser la transformation texte à modèle, nous avons écrit une transformation modèle à modèle en Acceleo (la `menuiserie`) qui consiste simplement à rétablir les e-references et avoir un modèle conforme à `ChaiseMinute`.


= Transformations Modèle à Texte
== Librairie et script de calcul automatique
On souhaite générer une librarie de calcul qui permet de charger et transformer des données conformes à un schéma de table.

Nous utilisons le language Python pour la produire. Ainsi, l'utilisateur peut écrire les différentes fonctions appelées dans son schéma de table dans ce langage, la librarie leur fera appel.

La librarie propose différentes fonctions pour manipuler des données à l'aide du schéma de table.
#figure(
  caption: [Signatures des fonctions de la librarie et fonction `main`],
)[#sourcecode()[```python
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

Lorsque qu'une colonne est référencée par un import ou en argument de fonction, le programme la cherchera en priorité dans les données de sortie (i.e. au sein de la table courante), puis parmis les données d'entrée.

== Outil de visualisation des données
En s'appuyant sur la même librarie, on crée un outil de visualisation de schéma de table en Python. (Voir @equation_vis)

= Edition graphique
== `ChaiseMinute`
Nous avons développé un outil graphique permettant de modifier des fichiers `.cm` (`ChaiseMinute`) pour modifier les différents `schémas de tables` et obtenir une visualisation plus pratique pour l'utilisateur.

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
  caption: [Sirius de ExempleComplique.cm.],
) <exempleCompliqueSiriusDiagram>

#figure(
  image("./images/paletteChaiseMinute.png", width: 25%),
  caption: [Palette de création de ChaiseMinute.],
) <paletteChaiseMinute>
=== Limitations
Il est possible pour l'utilisateur de rajouter des fonctions utiles pour une `ComputedColumn`. Cependant nous avons rencontré des difficultés à supprimer des fonctions avec l'éditeur graphique.
En effet, nous ajoutons et enlevons les fonctions en écrivant leur chemin dans une boite de dialogue texte mais pour l'enlever nous n'avons pas réussi à utiliser la valeur renvoyée pour vérifier si elle correspondait à une `Function` présente et donc la supprimer en conséquence.

== `Calculus`
Les fichiers `.clc`, pour `Calculus`, sont éditables dans Sirius et permettent une alternative au code Python.

Les `UsableExpression` et `FinalExpression` sont représentés par des `Node` et les `Pipes` comme des `Element Based Edge` :
- Les `InputArgs` en blanc,
- Les `Constante` en orange clair avec leur `value`,
- Les `BinaryExpression` en vert clair,
- Les `UnaryExpression` en bleu clair,
- Les `Pipe` et les `PipeFinal` en gris clair,
- Les `FinalExpression` en bleu clair.

Les noms sur les `Nodes` ou les `Edges` représentent les arguments `name` des `CalculusElement` associé.

#figure(
  image("images/meanFromCalculus.svg", width: 100%),
  caption: [Sirius de Mean.clc.],
) <meanSiriusDiagram>

#figure(
  image("./images/palettecalculus.png", width: 25%),
  caption: [Palette de création de Calculus.],
) <palettecalculus>


=== Limitations et améliorations <limitationSiriusCalculus>
Dans l'état actuel de notre représentation graphique, nous pouvons définir et créer des `CalculusElement` avec la palette de création.
Cependant, nous n'arrivons pas pour les `BinaryExpression` à définir uniquement la valeur du lien `beforeSecond` lorsque le lien `before` existe déjà.
En effet, quand nous relions ce nouveau lien, les valeurs de `before` et `beforeSecond` sont définies avec cette nouvelle valeur.
Nous avons isolé la partie et compris d'où venait le problème et n'arrivons pas à implémenter une solution convenable.
#figure(
  image("./images/odesign_calculus_error.png", width: 50%),
  caption: [Erreur conception Pipe Edge.],
) <odesignCalculusError>

Une piste d'amélioration de ce problème serait de créer des _Bordered Nodes_ indiquant le `before` et `beforeSecond` pour les `BinaryExpression` pour isoler le `Pipe` à modifier et ainsi résoudre notre problème. Dans la même idée, rajouter des _Bordered Nodes_ pour chaque entrée (`before`/`beforeSecond`) et sortie (`targetPipe`) pour visualiser correctement le nombre d'E/S nécessaire par expression.


= Exemples
== Equation du second degré
=== Modèle `TabouretSeconde` (syntaxe textuelle)
On utilise un schéma de table qui représente des polynômes du second degré dont on cherche les racines.

Les données d'entrée sont un fichier CSV qui contient une colonne par coefficient ($a$, $b$, $c$).

#figure(
  caption: "Description textuelle du schéma de table",
)[#sourcecode()[```ocaml
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


Finalement, une fonction de contrainte est vérifiée sur la colonne $a$, dont tous les éléments doivent être non nuls.
#sourcecode()[```python
  import numpy as np

  def ensure_is_not_null(x):
      return (np.array(x) != 0).all()
  ```]

=== Modèle `ChaiseMinute`
On transforme ensuite ce modèle intermédiaire en `ChaiseMinute` par notre transformation ATL `cmtToCm`

#figure(
  image("./images/equation_model.svg"),
  caption: [Modèle `chaiseMinute` obtenu vu sous Sirius.],
)

=== Génération de la librarie Python

On génère ensuite la librairie de calcul via la transformation modèle vers texte, un extrait est disponible ci-dessous.

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
On peut finalement appeler le script automatique (fonction `main` de la librarie).

#align(center)[#grid(
    columns: 2,
    gutter: 2cm,
    figure(caption: "Données d'entrée (CSV)")[#table(
        columns: 4,
        ..csv("./images/input_equations.csv").flatten()
      )],
  )[


    #figure(caption: "Données transformées (CSV)")[#table(
        columns: 6,

        ..csv("./images/output_equations.csv").flatten()
      )
    ]
  ]
]



On peut également voir les données dans l'outil de visualisation généré

#figure(
  caption: [Visualisation des données générées.],
  image("./images/equation_visualizer.png"),
) <equation_vis>

= Conclusion
//  qui doit inclure un bilan sur le projet (soit personnel soit de groupe), expliquant notamment les points de difficulté, et si possible une critique sur le sujet proposé

== Guillaume
J'ai trouvé le sujet un peu compliqué au début à devoir s'adapter à des contraintes d'utilisations et imaginer une solution sans avoir des contraintes techniques. Mais j'ai apprécié travailler en équipe pour trouver ces solutions et aboutir à un résultat exploitables et je pense y avoir gagné en management d'équipe et communication. Du côté technique j'ai pu travailler sur presque tous les types de transformations sauf texte à modèle ce qui m'a permis de mieux concevoir le travail d'un ingénieur logiciel qui doit s'adapter au problème qu'il rencontre.

== Timothé
C'était un travail difficile pour moi car j'ai eu du mal avec la liberté d'interprétation.//, où l'equipage a due faire face à vents et marées (Eclipse est à l'origine de la houle).
Dans ce projet, j'ai pu travailler sur la première version de la transformation de texte à modèle, la syntaxe concrète graphique et les contraintes statiques. Ce qui m'a permis de m'améliorer dans ces domaines.

== Louis
J'ai également eu du mal à interprêter le sujet qui est très libre, mais je pense que cette difficulté fait partie de l'exercice.

J'ai apprécié le fait que le projet nous force à nous coordonner pour délivrer les différentes parties et éviter les conflits.
Nous avons, par exemple, eu un problème de communication quant à la manière d'utiliser notre schéma de table en sortie (Entre le programme Python et les contraintes statiques).

== Simon
J'ai, tout comme mes camarades trouvé le sujet assez vague, ne proposant pas réellement de scénario ce qui a notamment causé des disonnances au sein de l'équipe sur ce qui devait être produit. Avec la complexité (parlons plutôt d'impossibilité) de modifier les métas-modeles au cours du projet, cela empêche de commencer réellement différents aspects du projet sereinement.
De plus l'outil Eclipse semble nécessiter plus d'expérience pour être utilisé que ce que nous avons, notamment en ce qui concerne la collaboration via git (et certains mystères qui resteront irrésolus et disparus après quelques redémarrage). Tout cela nous a fait "perdre" beaucoup de temps, ce qui reste très frustrant car nous avons l'impression de passer plus de temps à se battre contre l'outil plutôt que de travailler avec.
Cependant je tiens aussi à souligner que les concepts appris dans la matière sont très intéressants, et que mes camarades sont restés particulièrement sérieux dans l'exercice de collaboration.
// L'antagoniste principal reste le logiciel Eclipse lui-même.

= Annexes
//Une description détaillée de ce que contient le rendu (cf Section 4) : description succincte de chaque projet et des fichiers importants (méta-modèles, modèles exemple, fichiers de description, scripts, etc.)

== Workspaces `fr.n7.ChaiseMinute`
=== `fr.n7.ChaiseMinute`
Workspace contenant le méta-modèle `chaiseMinute.ecore` décrivant les schémas de tables. Ce projet contient aussi le code pour la validation des modèles. Pour valider un modèle vis-à-vis des contraintes statiques, il faut lancer la classe `ValidateChaiseMinute.java` suivi du chemin d'accès vers un modèle.
=== `fr.n7.ChaiseMinute.function`
Worksapce contenant le méta-modèle `function.ecore` décrivant les fonctions utilisées dans les `Algorithm` d'un modèle.
=== `fr.n7.ChaiseMinute.script`
Workspace contenant le méta-modèle `algorithm.ecore` décrivant les algorithmes (utilisations des fonctions) dans le méta-modèle `ChaiseMinute` pour pouvoir appliquer des opérations pour les `ComputedColumns`.
=== `fr.n7.ChaiseMinute.library`
Workspace Acceleo permettant la transformation du modèle instancié de `ChaiseMinute` vers un fichier Python en sortie pour vérifier les contraintes, appliquer le schéma et afficher les tables obtenues.
=== `fr.n7.ChaiseMinute.tabouretSeconde`
Worksapce comportant un fichier `TabouretSeconde.xtext` décrivant un langage textuel concret propre à `ChaiseMinute` pour décrire des schémas de tables (d'extension _cmt_). Cette transformation ne supportant pas les eOpposite, nous avons du créer une transformation Modèle à Modèle `menuiserie.atl` pour obtenir des vrais schémas de tables `ChaiseMinute`.
=== `fr.n7.ChaiseMinute.chaiseMinute.cmtToCm`
Workspace comportant la transformation Modèle à Modèle `menuiserie.atl` pour engendrer des `ChaiseMinute` (d'extension _xmi_ ou _cm_)à partir de la transforamtion xText.
== `fr.n7.ChaiseMinute.calculus`
Workspace contenant le méta-modèle `calculusv2.ecore` décrivant les fonctions/scripts que l'utilisateur pourra définir par un l'éditeur graphique Sirius. Une fois l'édition faite, nous voulions pouvoir transformer ces scripts en fichiers Python pour pouvoir être appelé dans les `Algorithm` au travers des paths, mais ayant eu des problèmes avec l'édition graphique, expliquées plus haut
(#link(<limitationSiriusCalculus>)[Limitations et améliorations]), nous n'avons pu aboutir à une transformation utilisable.

== Workspaces Sirius
=== `fr.n7.ChaiseMinute.design`
Workspace contenant le fichier `chaiseMinute.odesign` représentant le ViewPoint sous forme de containers d'un `ChaiseMinute` pour éditer des schémas de tables de façon graphique.
=== `fr.n7.ChaiseMinute.samples`
Workspace contenant des fichiers _cm_ de `ChaiseMinute` éditable par les utilisateurs.
=== `fr.n7.ChaiseMinute.calculus.v2design`
Workspace contenant le fichier `v2design.odesign` représentant le ViewPoint sous forme d'arbre d'un `Calculus` pour être modifié par les utilisateurs ensuite.
=== `fr.n7.ChaiseMinute.calculus.v2samples`
Workspace contenant des fichiers _clc_ de `Calculus` éditable par les utilisateurs.
== Workspaces Exemples
=== `fr.n7.ChaiseMinute.exemples`
Workspace contenant différents exemples d'utilisation de schémas de tables avec les résultats de leur transformation vers le modèle et les générations python.

- Dans ce projet, nous avons fournis dans `exemples_contraintes_statiques` deux exemples différents de modèle qui passent l'entièreté des contraintes statiques (nom commence par "ok"). Ainsi que 9 autres exemples qui ne passent pas les tests le nom du fichier précise l'erreur qui doit être levé par le validator.
== Figures Content
#outline(title: "Figures", target: figure)
