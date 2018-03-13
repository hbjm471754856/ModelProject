package com.cr.provider.service.impl;

import com.cr.provider.model.Role;
import com.cr.provider.mapper.RoleMapper;
import com.cr.provider.service.RoleService;
import com.cr.core.common.Constent;
import com.cr.core.common.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public Map<String, Object> methedName(Role role) throws Exception {
		return ResultType.getSuccessMap(null);
	}

	@Override
	public List<Role> selectAll() throws Exception {
		return null;
	}

}