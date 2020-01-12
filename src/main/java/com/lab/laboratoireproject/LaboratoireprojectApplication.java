package com.lab.laboratoireproject;

import com.lab.laboratoireproject.dao.MemberRepository;
import com.lab.laboratoireproject.dao.RoleRepository;
import com.lab.laboratoireproject.entites.EnseignantChercheur;
import com.lab.laboratoireproject.entites.Etudiant;
import com.lab.laboratoireproject.entites.Membre;
import com.lab.laboratoireproject.entites.Role;
import com.lab.laboratoireproject.service.IMemberService;
import com.lab.laboratoireproject.service.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


@SpringBootApplication
public class LaboratoireprojectApplication  implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    MemberRepository membreRepository;

    @Autowired
    IMemberService memberService;

    @Autowired
    IPublicationService publicationService;
    public static void main(String[] args) {
        SpringApplication.run(LaboratoireprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Role r1= new Role("admin");
        Role r2= new Role ("user");
        roleRepository.save(r1);
        roleRepository.save(r2);

        Collection<Role> lst1= new ArrayList<Role>();
        lst1.add(r1);

        Collection<Role> lst2= new ArrayList<Role>();
        lst2.add(r2);

        // Ajout d'un membre enseignant chercheur ayant le role admin

        EnseignantChercheur ens1= new EnseignantChercheur("01752354", "Jmaiel", "Mohamed", new Date(), "", null, "jmaiel@enis.tn", "0000");
        ens1.setRoles(lst1);
        membreRepository.save(ens1);

        // Ajout d'un membre enseignant chercheur ayant le role user
        EnseignantChercheur ens2= new EnseignantChercheur("01752354", "mariam", "lahami", new Date(), "", null, "lahami@enis.tn", "2222");
        ens2.setRoles(lst2);
        membreRepository.save(ens2);

        // ajout de 3  étudiants 1 mastère et 2 thése ayant le role user
        Etudiant etd1= new Etudiant("081705454", "ben fekih", "rim", new Date(), "", null, "rim@enis.rn", "11111", null, "test", "these");
        Etudiant etd2= new Etudiant("885705454", "ben ahmed", "sana", new Date(), "", null, "sana@enis.rn", "11111", null, "test", "mastere");
        Etudiant etd3= new Etudiant("081454", "chaari", "rim", new Date(), "", null, "chaari@enis.rn", "11111", null, "test", "these");
        etd1.setRoles(lst2);
        etd2.setRoles(lst2);
        etd3.setRoles(lst2);
        // ens1 est l'encadrant de etd1
        etd1.setEncadrant(ens1);
        //ens2 est l'encadrant de etd2
        etd2.setEncadrant(ens2);

        membreRepository.save(etd1);
        membreRepository.save(etd2);
        membreRepository.save(etd3);
        //on peut mettre addmember de service
        Etudiant etd4= new Etudiant("885705454", "raja", "rouj", new Date(), "", null, "hhhhh@enis.rn", "11111", null, "test", "mastere");

        memberService.addMember(etd4);
        Membre m=memberService.findMember(1L);
        m.setCv("cv1.pdf");
        memberService.updateMember(m);
        // Delete a Member
        //memberService.deleteMember(2L);
        // Ajouter un auteur dans une publication
        //Publication p= publicationService.findPubById(3L);
        //publicationService.addAuthor(m, p);



    }
}
