package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByDiplome(String diplome);
    List<Etudiant>findByDiplomeOrderByDateInscriptionDesc(String diplome);
}
