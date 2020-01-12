package com.lab.laboratoireproject.service;

import com.lab.laboratoireproject.entites.Role;

import java.util.List;



public interface IRoleService {

	public Role addRole(Role r);

	public void deleteRole(String id);

	public Role updateRole(Role role);

	public Role findRoleById(String id);
	public List<Role> findAllRole();
	

}
