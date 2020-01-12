package com.lab.laboratoireproject.service;

import java.sql.Date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lab.laboratoireproject.dao.PublicationRepository;
import com.lab.laboratoireproject.entites.Membre;
import com.lab.laboratoireproject.entites.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PublicationImpl implements IPublicationService {
	@Autowired
	PublicationRepository publicationrepository;
	@Override
	public Publication addPub(Publication m) {
	return publicationrepository.save(m);}
	@Override
	public void deletePub(Long id) {
	publicationrepository.deleteById(id);}
	@Override
	public Publication updatePub(Publication p) {
	return publicationrepository.saveAndFlush(p);}
	@Override
	public Publication findPubById(Long id) {
	return publicationrepository.findById(id).get();}
	@Override
	public List<Publication> findAllPub() {
	return publicationrepository.findAll();}
	@Override
	public void addAuthor(Membre m, Publication p) {
	Collection<Membre> auteurs= new ArrayList<Membre>();
	auteurs.add(m);
	p.setAuteurs(auteurs);
	publicationrepository.saveAndFlush(p);}
	public List<Publication> findPubBetweenDate(Date d1, Date d2) {
	return publicationrepository.findByDateApparitionBetween(d1, d2);}
	@Override
	public List<Publication> findPubByType(String type) {
	return publicationrepository.findByType(type);}
	@Override
	public List<Publication> findPubByDate(Date d) {
		// TODO Auto-generated method stub
		return null;
	}}
