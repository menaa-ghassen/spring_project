package com.lab.laboratoireproject.service;



import java.util.List;

import com.lab.laboratoireproject.dao.RoleRepository;
import com.lab.laboratoireproject.entites.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleImpl implements IRoleService {
	@Autowired
	RoleRepository rolerepository;

	@Override
	public Role addRole(Role r) {
		// TODO Auto-generated method stub
		return rolerepository.save(r);
	}

	@Override
	public void deleteRole(String id) {
		// TODO Auto-generated method stub
		rolerepository.deleteById(id);
	}

	@Override
	public Role updateRole(Role role) {
		// TODO Auto-generated method stub
		return rolerepository.saveAndFlush(role);
	}

	@Override
	public Role findRoleById(String id) {
		// TODO Auto-generated method stub
		return rolerepository.findById(id).get();
	}

	@Override
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return rolerepository.findAll();
	}
	
}
