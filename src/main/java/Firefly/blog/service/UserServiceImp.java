package Firefly.blog.service;


import Firefly.blog.dao.UserMapper;
import Firefly.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }


}
