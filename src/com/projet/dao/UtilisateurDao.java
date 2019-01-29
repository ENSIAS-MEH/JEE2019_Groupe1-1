package com.projet.dao;

import com.projet.beans.Utilisateur;

public interface UtilisateurDao {

    void creer( Utilisateur utilisateur ) throws DAOException;

    Utilisateur trouver( String email ) throws DAOException;
    
    void ajouter (Utilisateur utilisateur) throws DAOException;

}