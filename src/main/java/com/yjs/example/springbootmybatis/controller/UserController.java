package com.yjs.example.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.yjs.example.springbootmybatis.PageInfo;
import com.yjs.example.springbootmybatis.Taobao;
import com.yjs.example.springbootmybatis.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/userByPage/{pageNum}/{pageSize}")
    public List<Taobao> findByPage(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);//pageNum从1开始计数

        PageInfo<Taobao> pageInfo = new PageInfo<>(userMapper.findByPage());
        return pageInfo.getList();
    }
}
