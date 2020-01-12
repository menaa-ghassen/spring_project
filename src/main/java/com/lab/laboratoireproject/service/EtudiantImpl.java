package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.dao.EtudiantRepository;
import com.lab.laboratoireproject.entites.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EtudiantImpl implements IEtudiantService {
   @Autowired
   EtudiantRepository etudiantRepository;

@Override
public Etudiant addEtud(Etudiant etd) {
	// TODO Auto-generated method stub
	return etudiantRepository.save(etd) ;
}

@Override
public void deleteEtud(Long id) {
	// TODO Auto-generated method stub
	etudiantRepository.deleteById(id);;
}

@Override
public Etudiant updateEtud(Etudiant e) {
	// TODO Auto-generated method stub
	return etudiantRepository.saveAndFlush(e);
}

@Override
public Etudiant findEtudById(Long id) {
	// TODO Auto-generated method stub
	return etudiantRepository.findById(id).get();
}

@Override
public List<Etudiant> findAllEtud() {
	// TODO Auto-generated method stub
	return etudiantRepository.findAll();
}
}
