package com.lab.laboratoireproject.service;

import com.lab.laboratoireproject.entites.Membre;
import com.lab.laboratoireproject.entites.Publication;

import java.sql.Date;
import java.util.List;


public interface IPublicationService {
	//CRUD
	public Publication addPub(Publication m);
	public void deletePub(Long id) ;
	public Publication updatePub(Publication p) ;
	public Publication findPubById(Long id) ;
	public List<Publication> findAllPub();
	// Other
	public void addAuthor(Membre m, Publication p);
	public List<Publication> findPubByDate(Date d);
	public List<Publication> findPubByType(String type);
}
