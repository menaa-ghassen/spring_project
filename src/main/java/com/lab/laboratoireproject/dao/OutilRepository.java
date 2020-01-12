package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Outil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutilRepository extends JpaRepository<Outil,Long> {

    List<Outil> findAll();
    List<Outil> findByNom(String nom);
    List<Outil> findByNomStartingWith(String character);
}
