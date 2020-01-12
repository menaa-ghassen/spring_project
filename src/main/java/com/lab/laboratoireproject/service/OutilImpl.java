package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.dao.OutilRepository;
import com.lab.laboratoireproject.entites.Outil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OutilImpl implements IOutilService {
@Autowired
OutilRepository outilrepository;

@Override
public Outil addOutil(Outil m) {
	// TODO Auto-generated method stub
	return outilrepository.save(m);
}

@Override
public void deleteOutil(Long id) {
	// TODO Auto-generated method stub
	outilrepository.deleteById(id);
}

@Override
public Outil updateOutil(Outil o) {
	// TODO Auto-generated method stub
	return outilrepository.saveAndFlush(o);
}

@Override
public Outil findoutilById(Long id) {
	// TODO Auto-generated method stub
	return outilrepository.findById(id).get();
}

@Override
public List<Outil> findAllOutil() {
	// TODO Auto-generated method stub
	return outilrepository.findAll();
}
}
