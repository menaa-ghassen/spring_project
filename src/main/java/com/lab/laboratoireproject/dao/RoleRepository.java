package com.lab.laboratoireproject.dao;

import com.lab.laboratoireproject.entites.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {

}
