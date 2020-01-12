package com.lab.laboratoireproject.service;

import com.lab.laboratoireproject.entites.EnseignantChercheur;

import java.util.List;




public interface IEnseignantChercheurService  {
	//CRUD
		public EnseignantChercheur addEnsCher(EnseignantChercheur ens);
		public void deleteEnsCher(Long id) ;
		public EnseignantChercheur updateEnsCher(EnseignantChercheur enscher) ;
		public EnseignantChercheur findEnsCherById(Long id) ;
		public List<EnseignantChercheur> findAllEnsCher();
		
}
