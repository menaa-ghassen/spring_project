package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.entites.Outil;


public interface IOutilService {
	
	public Outil addOutil(Outil m);

	public void deleteOutil(Long id);

	public Outil updateOutil(Outil o);

	public Outil findoutilById(Long id);
	public List<Outil> findAllOutil();
}
