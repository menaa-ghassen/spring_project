package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface PublicationRepository  extends JpaRepository<Publication, Long> {
    List<Publication> findByType(String type);
    List<Publication> findByDateApparitionBetween(Date d1, Date d2);

}
