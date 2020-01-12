package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.dao.EnseignantChercheurRepository;
import com.lab.laboratoireproject.entites.EnseignantChercheur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class EnseignantChercheurImpl implements IEnseignantChercheurService {
	@Autowired
	EnseignantChercheurRepository enseignantChercheurrepository;

	@Override
	public EnseignantChercheur addEnsCher(EnseignantChercheur ens) {
		// TODO Auto-generated method stub
		return enseignantChercheurrepository.save(ens);
	}

	@Override
	public void deleteEnsCher(Long id) {
		// TODO Auto-generated method stub
		enseignantChercheurrepository.deleteById(id);
		
	}

	@Override
	public EnseignantChercheur updateEnsCher(EnseignantChercheur enscher) {
		// TODO Auto-generated method stub
		return enseignantChercheurrepository.saveAndFlush(enscher);
	}

	@Override
	public EnseignantChercheur findEnsCherById(Long id) {
		// TODO Auto-generated method stub
		return  enseignantChercheurrepository.findById(id).get();
	}

	@Override
	public List<EnseignantChercheur> findAllEnsCher() {
		// TODO Auto-generated method stub
		return enseignantChercheurrepository.findAll();
	}

}
