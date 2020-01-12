package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Membre,Long>
{

    List<Membre> findByCin(String cin);
    List<Membre>findByNomStartingWith(String caractere);
    List<Membre> findByEmail(String email);


}
