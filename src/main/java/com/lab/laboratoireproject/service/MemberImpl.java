package com.lab.laboratoireproject.service;

import java.util.List;

import com.lab.laboratoireproject.dao.EnseignantChercheurRepository;
import com.lab.laboratoireproject.dao.EtudiantRepository;
import com.lab.laboratoireproject.dao.MemberRepository;
import com.lab.laboratoireproject.entites.EnseignantChercheur;
import com.lab.laboratoireproject.entites.Etudiant;
import com.lab.laboratoireproject.entites.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberImpl  implements IMemberService{
	@Autowired
	MemberRepository memberRepository;
	EnseignantChercheurRepository enseignantChercheurRepository;
	EtudiantRepository etudiantRepository;
	public Membre addMember(Membre m) {
	memberRepository.save(m);
	return m;
	}
	public void deleteMember(Long id) {
	memberRepository.deleteById(id);
	}
	public Membre updateMember(Membre m) {
	return memberRepository.saveAndFlush(m);
	}
	public Membre findMember(Long id) {
	Membre m= (Membre)memberRepository.findById(id).get();
	return m;}
	@Override
	public List<Membre> findAll() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}
	@Override
	public Membre findByCin(String cin) {
		// TODO Auto-generated method stub
		return (Membre) memberRepository.findByCin(cin);
	}
	@Override
	public Membre findByEmail(String email) {
		// TODO Auto-generated method stub
		return (Membre) memberRepository.findByEmail(email);
	}
	@Override
	public List<Membre> findByNom(String nom) {
		// TODO Auto-generated method stub
		return memberRepository.findByNomStartingWith(nom);
	}
	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		// TODO Auto-generated method stub
		return etudiantRepository.findByDiplome(diplome);
	}
	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		// TODO Auto-generated method stub
		return enseignantChercheurRepository.findByGrade(grade);
	}
	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		// TODO Auto-generated method stub
		return null;
	}
}
