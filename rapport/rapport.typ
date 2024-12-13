#import "/template/template.typ": *
#import "@preview/codelst:2.0.1": sourcecode

#show: project.with(
  subject: "Ingénierie Dirigée par les Modèles", title: "Projet IDM : chaiseMinute", authors: ("LEBOBE Timothée", "LECUYER Simon","SABLAYROLLES Guillaume", "THEVENET Louis",), date: "Novembre 2024 - Decembre 2024", subtitle: "Groupe L34-2", toc: true,
)

= Introduction
Ce projet consiste en la réalisation d'un environnement de calcul Domaine-Scientifique nommé : ChaiseMinute.

ChaiseMinute permet à tous ses utilisateurs de développer des `schémas de tables` et des `librairies` pour réaliser des calculs automatiques sur ces schémas. Ainsi l'utilisateur pourra produire des outils pour d'autres utilisateurs finaux souhaitant manipuler des données sans avoir à créer leur propres outils.

L'utilisateur de `ChaiseMinute` diposera d'une syntaxe textuelle ainsi qu'un outil graphique permettant de définir ses schémas de tables. Les schémas de tables pourront être transformés dans des langages plus spécifiques au calcul pour pouvoir utiliser les données avec.  

= Méta-Modèles
Pour les méta-modèles nous avons décidés de séparer en trois méta-modèles pour représenter l'objectif : 
+ ChaiseMinute.Ecore
  - Point d'entrée, il permet de définir les schéma de table
+ Algorithm.Ecore
  - Définir l'algorithme utilisé pour les `ComputedColumns`
+ Function.Ecore
  - Pour spécifier les `Functions` utiles pour `Algorithm`

== `ChaiseMinute`
#figure(
  image("/images/chaiseMinuteDiagram.svg", width: 100%),
  caption: [ChaiseMinute Ecore Diagram.],
) <chaiseMinuteDiagram>

- `ChaiseMinute` représente le container permettant de regrouper les schémas de tables entre eux.
- `Table` défini un schéma de table comme un ensemble de `Column` et d'une `IndexColumn`
- `IndexColumn` : est une colonne spéciale pour les index des lignes
- `Column` est une interface regroupant les propriétés pour les différents type de colonnes possible dans le schémas de table : 
  - `ColumnData` : une colonne simple par une donnée,
  - `ImportedColumn` : une colonne provenant d'une autre `Table`,
  - `ComputedColumn` : représentant une colonne calculée avec un `Algorithm` pouvant provenir de `Column` de la même `Table` ou non

== `Algorithm`
#figure(
  image("/images/algorithmDiagram.svg", width: 60%),
  caption: [Algorithm Diagram.],
) <algorithDiagram>

== `Function` 
#figure(
  image("/images/functionDiagram.svg", width: 50%),
  caption: [Algorith Diagram.],
) <functionDiagram>

= Transforamtions Texte à Modèle de `ChaiseMinute`
= Transformations Modèle à Texte
== `ChaiseMinute` vers Python
= Transformations Modèle à Modèle
= Edition graphique
Nous avons développé un outils graphique permettant de modifier des fichiers .cml (`ChaiseMinute`) pour modifier les différents `schémas de tables` et obtenir une visualisation plus pratique pour l'utilisateur.

  - Les `Tables` sont représentées par des container blanc
  - Les `IndexColumn` sont représentées par des container rouge à l'intérieur des `Tables`

Il est aussi possible pour l'utilisateur de rajouter des fonctions utiles pour une `ComputedColumn`. Cependant nous avons rencontré des difficultés à choisir des fonctions inutile. En effet, nous ajoutons et enlevons les fonctions en écrivant leur chemin dans une boite de dialogue texte mais pour l'enlever nous n'avons pas réussi à utiliser la valeur renvoyée pour vérifier si elle correspondait à un fichier présent et donc le supprimer en conséquence.

= Exemples


= Conclusion
//  qui doit inclure un bilan sur le projet (soit personnel soit de groupe), expliquant notamment les points de difficulté, et si possible une critique sur le sujet proposé

= Annexes
//Une description détaillée de ce que contient le rendu (cf Section 4) : description succincte de chaque projet et des fichiers importants (méta-modèles, modèles exemple, fichiers de description, scripts, etc.)
