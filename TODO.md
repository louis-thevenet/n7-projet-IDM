- [x] F1 L’utilisateur doit pouvoir composer, sauvegarder et consulter des schémas de table dans une interface ergonomique et adaptée.
  - [x] F1.1 L’utilisateur doit pouvoir définir des colonnes.
        Ces colonnes doivent être pourvues d’un identifiant unique (pour les références croisées).
  - [x] F1.2 Un schéma de table doit contenir une colonne spéciale pour les identifiants des lignes
        (pour les références croisées, en particulier F1.4).
  - [x] F1.3 L’utilisateur peut déclarer qu’une colonne dérive d’autres colonnes
        en précisant un algorithme et la façon d’utiliser cet algorithme (par ex. quelles colonnes sont utilisées pour l’entrée).
        La sémantique de cela est que le contenu de la colonne est calculé en utilisant les colonnes indiquées et par l’algorithme indiqué.
  - [x] F1.4 L’utilisateur peut déclarer qu’une colonne provient d’une autre table, en indiquant le schéma de la table étrangère et la colonne à extraire de cette table.
        Cela permet de traiter simultanément plusieurs tables.
  - [x] F1.5 L’utilisateur doit pouvoir définir des contraintes sur les colonnes, qui sont des prédicats à vérifier lorsque l’on importe des données. Cela permet de détecter des valeurs erronées pour notifier l’utilisateur, par exemple.
- [ ] F2 L’utilisateur doit pouvoir composer, sauvegarder et consulter des algorithmes dans une interface ergonomique et adaptée.
  - [ ] F2.1 Un algorithme spécifie une fonction (au sens large) en donnant la ressource qui réalise l’algorithme ainsi que le détail de ses entrées et sorties.
  - [ ] F2.2 L’utilisateur doit pouvoir définir des entrées et sorties, qui sont reliées à l’interface relative à la ressource (entrées/sorties du calcul ou arguments/retour de fonction).
  - [ ] F2.3 L’utilisateur doit pouvoir fixer une entrée du programme, ce qui permet de proposer un algorithme avec un paramètre particulier.
  - [ ] F2.4 L’utilisateur doit pouvoir documenter un algorithme, pour identifier ce que fait chaque entrée, décrire l’algorithme, etc.
  - [ ] F2.5 La ressource associée à l’algorithme est un fichier, un programme ou autre qui est utilisé pour effectuer le calcul.
        Il peut s’agir d’un script « extérieur » écrit dans un langage quelconque (Python, MATLAB ou autre) ou d’une formule définie sur la plate-forme à l’aide d’un langage dédié (voir fonctionnalités F3).
  - [ ] F2.6 Les algorithmes sont clairement identifiés et pourraient être regroupés au sein de catalogues partageables et réutilisables, rendus disponibles par et pour les utilisateurs.
- [ ] F3 L’utilisateur doit pouvoir composer, sauvegarder et consulter des scripts de calculs dans un langage dédié propre à la plate-forme.
  - [ ] F3.1 L’utilisateur doit pouvoir spécifier les calculs à l’aide d’une syntaxe concrète graphique.
  - [ ] F3.2 L’utilisateur doit pouvoir déclarer les entrées (les arguments) et les sorties (les résultats) du calcul.
  - [ ] F3.3 L’utilisateur doit pouvoir spécifier les opérations à réaliser à l’aide de blocs disposant d’entrées et de sortie. Les opérations disponibles sont fixes.
  - [ ] F3.4 L’utilisateur doit pouvoir réaliser (au minimum) des sommes, des produits, prendre l’opposé et l’inverse, la division, le minimum et le maximum de deux valeurs.
  - [ ] F3.5 L’utilisateur doit pouvoir faire appel à des fonctions classiques des mathématiques (par ex. sinus, cosinus, racine carrée, exponentielle, etc.).
  - [ ] F3.6 L’utilisateur doit pouvoir introduire des constantes dans ses calculs, autrement dit des valeurs codées en dur qui ne dépendent pas de l’entrée.
- [x] F4 L’utilisateur doit pouvoir générer, à partir d’un schéma de table (et d’éventuels composants satellites), une librairie de traitement de données conformes au schéma donné.
  - [x] F4.1 La librairie sera fournie dans un langage cible, compatible avec les algorithmes associés au schéma de table.
  - [x] F4.2 La librairie doit permettre d’importer des données pour les utiliser ailleurs dans un programme. Les formats d’entrées possibles doivent contenir, au minimum, le format CSV 3.
  - [x] F4.3 La librairie doit permettre de réaliser les vérifications associées aux contraintes associées au schéma (F1.5) sur les données importées.
  - [x] F4.4 La librairie doit permettre de réaliser les calculs associés au schéma (F1.3) sur les données importées, et notamment les réaliser dans le bon ordre (si une colonne dérivée intervient comme argument d’un calcul, par exemple).
  - [x] F4.5 La librairie doit gérer correctement les références croisées (F1.4).
  - [x] F4.6 La librairie doit permettre d’exporter les données dans un format standard, incluant au minimum le format CSV (voir plus haut).
- [x] F5 L’utilisateur doit pouvoir générer, à partir d’un schéma de table (et d’éventuels composants satellites) un outil de visualisation spécifique aux données conformes au schéma donné.
- [x] F6 L’utilisateur doit pouvoir générer, à partir d’un schéma de table (et d’éventuels composants satellites)
      un script de calcul automatique, qui prend en entrée des données conformes au(x) schéma(s) requis et met à jour les colonnes dérivées (F1.3, F1.4). 3. Voir https://fr.wikipedia.org/wiki/Comma-separated_values

