package com.lab.laboratoireproject.service;

import com.lab.laboratoireproject.entites.Evenement;

import java.util.List;




public interface IEvenementService {
	public Evenement addevent(Evenement m);
	public void deleteevent(Long id) ;
	public Evenement updatePub(Evenement p) ;
	public Evenement findeventById(Long id) ;
	public List<Evenement> findAllevent();
}
