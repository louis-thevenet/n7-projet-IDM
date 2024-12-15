#import "./template/template.typ": *
#import "@preview/codelst:2.0.1": sourcecode

#show: project.with(
  subject: "Ingénierie Dirigée par les Modèles",
  title: "Projet IDM : chaiseMinute",
  authors: (
    "LEBOBE Timothée",
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
  - Point d'entrée, il permet de définir les schéma de table
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
  caption: [Algorith Diagram.],
) <functionDiagram>

Une `Function` est représentée par un identifiant qui référence un programme Python, elle contient des arguments, qui sont des références vers des colonnes. Les colonnes sont représentées sous la forme `nomTable.nomColonne` dans tout le projet (pour les références croisées de @chaiseMinuteDiagram, les arguments de fonctions, etc).

=== Limitations
On aurait pu faire en sorte que les `Function` soient des arguments, ainsi on aurait pu construire un arbre d'appels et prendre la sortie de plusieurs fonctions à la fois en arguments. On peut quand même obtenir ce résultat avec le système actuel en adaptant les fonctions Python pour qu'elles renvoient plusieurs colonnes, ainsi en adaptant la fonction suivante pour qu'elle récupère ces deux colonnes, on imite le fonctionnement d'un arbre d'appels.

= Transforamtions Texte à Modèle de `ChaiseMinute`
= Génération de la librarie et du script de calcul (Transformation M2T)
Nous avons décidé d'utiliser le language Python pour nos algorithmes. Ainsi, pour générer une librarie de calcul à partir d'un schéma de table, il nous suffit de générer un programme Python qui appelle les fonctions référencées par les algorithmes et les contraintes.

Nous générons aussi une fonction `main` dans notre librarie qui prend en entrée des fichier au format CSV et qui en génèrent de nouveaux en appliquant le schéma de table, résultant en un script de transformation automatique des données.

// ici ajouter une image du modèle exemple-compliqué et les fonctions python

== Exemple

= Transformations Modèle à Modèle
= Edition graphique
Nous avons développé un outils graphique permettant de modifier des fichiers .cml (`ChaiseMinute`) pour modifier les différents `schémas de tables` et obtenir une visualisation plus pratique pour l'utilisateur.

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

= Exemples


= Conclusion
//  qui doit inclure un bilan sur le projet (soit personnel soit de groupe), expliquant notamment les points de difficulté, et si possible une critique sur le sujet proposé

= Annexes
//Une description détaillée de ce que contient le rendu (cf Section 4) : description succincte de chaque projet et des fichiers importants (méta-modèles, modèles exemple, fichiers de description, scripts, etc.)
