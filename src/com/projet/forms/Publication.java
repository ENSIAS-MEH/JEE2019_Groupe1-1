package com.projet.forms;

public class Publication {
	
	int idPublication ;
	int idPublisher ;
	String titre ;
	String Description ;
	String URL ;
	int publicPost ;
	
	public int getIdPublisher() {
		return idPublisher;
	}
	public void setIdPublisher(int idPublisher) {
		this.idPublisher = idPublisher;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public int getPublicPost() {
		return publicPost;
	}
	public void setPublicPost(int publicPost) {
		this.publicPost = publicPost;
	}
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
		return "Publication [idPublication=" + idPublication + ", idPublisher=" + idPublisher + ", titre=" + titre
				+ ", Description=" + Description + ", URL=" + URL + ", publicPost=" + publicPost + "]";
	}
	
	
	
	

}
