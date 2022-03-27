# parc animalier (FR)

Pour la gestion d’un parc animalier, voici une application traitant des animaux de nature diverse : des reptiles, qui peuvent être des serpents ou des lézards, des oiseaux, des mammifères, etc. Tous les animaux ont un nom (une chaîne de caractères) et une date de naissance (une chaîne de caractères). Les reptiles ont, en plus, une taille (un réel) et un genre : aquatique ou terrestre  (un  booléen  valant  true  si  le  reptile  est  aquatique).  Les  serpents  ont  une dangerosité : mortel, paralysant, inoffensif (chaîne de caractères), tandis que les lézards ont une couleur (une chaîne de caractères). Les oiseaux ont une zone de nidification (une chaîne de caractères) et un nombre d’œufs par ponte (un entier), et les mammifères ont un nombre de pattes (un entier) et un poids (un réel). Tous les divers objets en question ici (reptiles, serpents, lézards, oiseaux, mammifères, etc.) doivent pouvoir être manipulés en tant que animaux.

Un parc animalier sera représenté par un tableau d’animaux. 

• ParcAnimalier(int capacité) - constructeur qui crée un parc animalier ayant la capacité (nombre maximum d’animaux) indiquée,  <br/>
• void afficherAnimaux() - affiche tous les animaux du parc animalier, <br/>
• Animal animal(int i) - renvoie le ième animal, <br/>
• boolean ajouter(Animal anim) - ajoute l’animal indiqué et renvoie true (false en cas d’échec),<br/>
• boolean supprimer(Animal anim) - supprime l’animal indiqué et renvoie true (false en cas d’échec),<br/>
• void afficherTaille() - affiche la liste des tailles de tous les animaux qui ont une taille <br/>
