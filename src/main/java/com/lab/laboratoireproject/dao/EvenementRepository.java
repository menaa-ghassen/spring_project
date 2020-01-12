package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;


import java.util.List;

@Repository
public interface EvenementRepository  extends JpaRepository<Evenement,Long> {

    List<Evenement> findAll();
    List<Evenement> findByNom(String nom);
    List<Evenement> findByNomStartingWith(String character);
    List<Evenement> findByDateEVT (Date date);

}
