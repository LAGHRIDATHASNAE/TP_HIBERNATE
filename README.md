# TP_HIBERNATE

Ce Tp consiste à réaliser ou implémenter le mapping des associations: OneToOne, ManyToOne, OneToMany et ManyToMany, ainsi le mapping de l'héritage, précisément la méthode "JOINED".

Ex2)

Cet exercice a pour architecture:

ma.projet
1)classes(Produit,Categorie,LigneCommandeProduit)
2)services(ProduitService,CategorieService,LigneCommandeProduitService)
3)config(hibernate.cfg.xml)
4)util(HibernateUtil)
5)Test(Test --> plusieurs fichiers réparties, chaque entité a son fichier de test/ manipulation avec la base de         
        données/l'affichage composé des méthodes définies au niveau du couche service.
        
Ex3)
Cet exercice a pour architecture:

ma.projet
1)classes(Employe,Tache,EmployeTache,EmployeTacheKey,Projet)
2)services(EmployeService,TacheService,EmployeTacheService,ProjetService)
3)config(hibernate.cfg.xml)
4)util(HibernateUtil)
5)Test(Test --> un seul fichier test qui comporte tous les tests fournies et l'affichage composé des méthodes définies au niveau           du couche service.

Travail à Rendre)
Cet exercice a pour architecture:

ma.projet
1)classes(Personne,Homme,Femme,Mariage,MariageKey)
2)services(PersonneService,HommeService,FemmeService,MariageService)
3)config(hibernate.cfg.xml)
4)util(HibernateUtil)
5)Test(Test --> un seul fichier test qui comporte tous les tests fournies et l'affichage composé des méthodes définies au niveau           du couche service.

A ne pas oublier de créer les base de données suivantes : hibernate4, mariage, et hibernate2 pour éviter les erreurs et les exceptions de connexion à la base de données.
