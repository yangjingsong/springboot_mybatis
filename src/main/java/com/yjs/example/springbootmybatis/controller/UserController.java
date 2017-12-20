package com.yjs.example.springbootmybatis.controller;

import com.yjs.example.springbootmybatis.Taobao;
import com.yjs.example.springbootmybatis.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yjs on 2017/12/19.
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/user")
    public List<Taobao> getAll(){
        return userMapper.getAll();
    }
}
