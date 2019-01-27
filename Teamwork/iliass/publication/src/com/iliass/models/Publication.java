package com.iliass.models;

public class Publication {
	
	int idPublication ;
	String titre ;
	String Description ;
	public int getIdPublication() {
		return idPublication;
	}
	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "Publication [idPublication=" + idPublication + ", titre=" + titre + ", Description=" + Description
				+ "]";
	}
	
	
	

}
