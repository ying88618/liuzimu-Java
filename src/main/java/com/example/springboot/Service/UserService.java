package com.example.springboot.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.Result;
import com.example.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public interface UserService extends IService<User> {
    //注册
    void register(String username,String password);

    User findByUsername(String username);

    Result judge(User u, String password);

    void update(User user);

    void updateAvatar(String avatarUrl);

    boolean exist(String username);

    Result updatePwd(Map<String,String> map,String token);
}
