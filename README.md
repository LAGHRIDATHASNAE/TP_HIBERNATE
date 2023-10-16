# TP_HIBERNATE

Ce Tp consiste à réaliser ou implémenter le mapping des associations: OneToOne, ManyToOne, OneToMany et ManyToMany, ainsi le mapping de l'héritage, précisément la méthode "JOINED".

Ex2)
Ex3)
Cet exercice a pour architecture:

ma.projet--classes(Produit,Categorie,LigneCommandeProduit)
        |--services(ProduitService,CategorieService,LigneCommandeProduitService)
        |--config(hibernate.cfg.xml)
        |--util(HibernateUtil)
        |--Test(Test --> plusieurs fichiers réparties, chaque entité a son fichier de test/ manipulation avec la base de         
        données/l'affichage composé des méthodes définies au niveau du couche service.
        
Ex3)
Cet exercice a pour architecture:

ma.projet--classes(Employe,Tache,EmployeTache,EmployeTacheKey,Projet)
        |--services(EmployeService,TacheService,EmployeTacheService,ProjetService)
        |--config(hibernate.cfg.xml)
        |--util(HibernateUtil)
        |--Test(Test --> un seul fichier test qui comporte tous les tests fournies et l'affichage composé des méthodes définies au niveau           du couche service.

Travail à Rendre)
Cet exercice a pour architecture:

ma.projet--classes(Personne,Homme,Femme,Mariage,MariageKey)
        |--services(PersonneService,HommeService,FemmeService,MariageService)
        |--config(hibernate.cfg.xml)
        |--util(HibernateUtil)
        |--Test(Test --> un seul fichier test qui comporte tous les tests fournies et l'affichage composé des méthodes définies au niveau           du couche service.

A ne pas oublier de créer les base de données suivantes : hibernate4, mariage, et hibernate2 pour éviter les erreurs et les exceptions de connexion à la base de données.
