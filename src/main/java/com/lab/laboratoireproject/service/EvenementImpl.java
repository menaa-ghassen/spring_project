package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.dao.EvenementRepository;
import com.lab.laboratoireproject.entites.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EvenementImpl implements IEvenementService {
@Autowired
EvenementRepository evenementRepository ;

@Override
public Evenement addevent(Evenement ev) {
	// TODO Auto-generated method stub
	return evenementRepository.save(ev);
}

@Override
public void deleteevent(Long id) {
	// TODO Auto-generated method stub
	evenementRepository.deleteById(id);
}

@Override
public Evenement updatePub(Evenement evt) {
	// TODO Auto-generated method stub
	return evenementRepository.saveAndFlush(evt);
}

@Override
public Evenement findeventById(Long id) {
	// TODO Auto-generated method stub
	return evenementRepository.findById(id).get();
}

@Override
public List<Evenement> findAllevent() {
	// TODO Auto-generated method stub
	return evenementRepository.findAll();
}
}
