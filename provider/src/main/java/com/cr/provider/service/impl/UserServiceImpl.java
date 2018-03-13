package com.cr.provider.service.impl;

import com.cr.core.common.Constent;
import com.cr.core.common.ResultType;
import com.cr.provider.mapper.UserMapper;
import com.cr.provider.model.User;
import com.cr.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override
    public Map<String, Object> add(User user) throws Exception {
        int count = this.userMapper.insertSelective(user);
        if (count == 0) {
            return ResultType.getFailMap(Constent.RETURN_MSG_EDIT_FAIL);
        }
        return ResultType.getSuccessMap(count);
    }

    @Override
    public List<User> selectAll() throws Exception {
        return this.userMapper.selectAll();
    }
}
