Create table Utilisateur (
id_utilisateur INT( 11 ) NOT NULL AUTO_INCREMENT ,
nom_utilisateur VARCHAR( 60 ) NOT NULL ,
email VARCHAR( 60 ) NOT NULL ,
mot_de_passe VARCHAR( 60 ) NOT NULL ,
pseudo VARCHAR( 60 )  ,
adresse VARCHAR( 60 )  ,
pays VARCHAR( 60 )  ,
code_postal INT( 11 ),
type_contenu VARCHAR( 60 ) ,
lien VARCHAR( 60 ) ,
about_me VARCHAR( 90 ) ,
total_spent INT( 11 ),
total_earned INT( 11 ),
PRIMARY KEY ( id_utilisateur ),
UNIQUE ( email )
)


create table Sabonner(
  id_posteur int ,
  id_abonne int ,
  primary key (id_posteur, id_abonne),
  CONSTRAINT fk_Utilisateur_idUtilisateur1 foreign key (id_posteur) references Utilisateur(id_utilisateur) ,
  CONSTRAINT fk_Utilisateur_idUtilisateur2 foreign key (id_abonne) references  Utilisateur(id_utilisateur) 
);


create table Postes(
  id_Poste INT( 11 ) NOT NULL AUTO_INCREMENT,
  id_posteur INT( 11 ) NOT NULL ,
  Titre VARCHAR( 30 ),
  Description VARCHAR( 90 ),
  primary key (id_poste),
  CONSTRAINT fk_Utilisateur_idUtilisateur3 foreign key (id_posteur) references Utilisateur(id_utilisateur)
) ;
