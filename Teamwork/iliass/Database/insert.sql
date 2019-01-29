insert into Utilisateur (nom_utilisateur,email,mot_de_passe) values('iliass' ,'iliass@gmail.com',MD5('iliass')) ;
insert into Utilisateur (nom_utilisateur,email,mot_de_passe) values('oumayma' ,'oumayma@gmail.com',MD5('iliass')) ;
insert into Utilisateur (nom_utilisateur,email,mot_de_passe) values('amine' ,'amine@gmail.com',MD5('iliass')) ;
insert into Utilisateur (nom_utilisateur,email,mot_de_passe) values('khadija' ,'khadija@gmail.com',MD5('khadija')) ;
insert into Postes(id_posteur, Titre, Description) values (1 , "Titre 1", "Description 1" ) ; 
insert into Postes(id_posteur, Titre, Description) values (1 , "Titre 2", "Description 2" ) ; 
insert into Postes(id_posteur, Titre, Description) values (1 , "Titre 3", "Description 3" ) ;     
insert into Postes(id_posteur, Titre, Description,URL,public) values (1 , "Titre 3", "Description 3","www.youtube.com",0 );
insert into Postes(id_posteur, Titre, Description,URL,public) values (1 , "Titre 3", "Description 3","www.youtube.com",0 );                                                                                                       
insert into Postes(id_posteur, Titre, Description,URL,public) values (2 , "Titre 20", "Description 20","www.youtube.com",0 );  

insert into Postes(id_posteur, Titre, Description,URL,public) values (2 , "Titre 21", "Description 21","www.youtube.com",0 );       
                                                                                                       
insert into AimerPoste(id_utilisateur, id_Poste) values(1,1);           
insert into AimerPoste(id_utilisateur, id_Poste) values(2,1);
insert into AimerPoste(id_utilisateur, id_Poste) values(3,1);
