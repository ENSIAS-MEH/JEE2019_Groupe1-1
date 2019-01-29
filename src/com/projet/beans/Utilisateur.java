package com.projet.beans;

import java.sql.Timestamp;

public class Utilisateur {

    private Long      id_utilisateur;
    private String    email;
    private String    motDePasse;
    private String    nom;
    private Timestamp dateInscription;
    private String    pseudo;
    private String    adresse;
    private String    pays;
    private String    code_postal;
    private String    type_contenu;
    private String    lien;
    private String    about_me;
  



    public Long getId() {
        return id_utilisateur;
    }
    public void setId( Long id ) {
        this.id_utilisateur = id;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setMotDePasse( String motDePasse ) {
        this.motDePasse = motDePasse;
    }
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    public Timestamp getDateInscription() {
        return dateInscription;
    }
    public void setDateInscription( Timestamp dateInscription ) {
        this.dateInscription = dateInscription;
    }
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public String getType_contenu() {
		return type_contenu;
	}
	public void setType_contenu(String type_contenu) {
		this.type_contenu = type_contenu;
	}
	public String getAbout_me() {
		return about_me;
	}
	public void setAbout_me(String about_me) {
		this.about_me = about_me;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
}