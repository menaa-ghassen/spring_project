package com.lab.laboratoireproject.service;

import com.lab.laboratoireproject.entites.Etudiant;

import java.util.List;


public interface IEtudiantService {
	//CRUD
		public Etudiant addEtud(Etudiant etd);
		public void deleteEtud(Long id) ;
		public Etudiant updateEtud(Etudiant e) ;
		public Etudiant findEtudById(Long id) ;
		public List<Etudiant> findAllEtud();
}
