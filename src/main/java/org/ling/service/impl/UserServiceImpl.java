package org.ling.service.impl;

import org.ling.dao.UserDao;
import org.ling.pojo.po.User;
import org.ling.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserDao userDao;
    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
