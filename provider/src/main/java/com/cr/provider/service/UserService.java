package com.cr.provider.service;

import com.cr.provider.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    Map<String, Object> add(User user) throws Exception;

    List<User> selectAll() throws Exception;
}
