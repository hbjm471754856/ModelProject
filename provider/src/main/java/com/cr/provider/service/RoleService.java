package com.cr.provider.service;

import com.cr.provider.model.Role;

import java.util.List;
import java.util.Map;

public interface RoleService{

	Map<String, Object> methedName(Role role) throws Exception;

	List<Role> selectAll() throws Exception;

}