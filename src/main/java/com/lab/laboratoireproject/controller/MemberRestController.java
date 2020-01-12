package com.lab.laboratoireproject.controller;

import java.util.List;

import com.lab.laboratoireproject.entites.EnseignantChercheur;
import com.lab.laboratoireproject.entites.Etudiant;
import com.lab.laboratoireproject.entites.Membre;
import com.lab.laboratoireproject.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MemberRestController {

	@Autowired
	IMemberService memberService;

	@RequestMapping(value="/membres", method=RequestMethod.GET)
	public List<Membre> findMembres (){
	return memberService.findAll();
}

	@GetMapping(value="/membre/{id}")
	public Membre findOneMemberById(@PathVariable Long id){
	return memberService.findMember(id);
	}

	@PostMapping("/membres/enseignant")
	public Membre addMembre(@RequestBody EnseignantChercheur enseignantChercheur) {
		return memberService.addMember(enseignantChercheur);
	}

	@PostMapping("/membres/etudiant")
	public Membre addMembre(@RequestBody Etudiant etudiant) {
		return memberService.addMember(etudiant);
	}



}
