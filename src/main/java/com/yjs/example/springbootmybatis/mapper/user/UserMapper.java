package com.yjs.example.springbootmybatis.mapper.user;

import com.github.pagehelper.Page;
import com.yjs.example.springbootmybatis.Taobao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yjs on 2017/12/19.
 */
@Component
//@Mapper
public interface UserMapper {
    List<Taobao> getAll();

    Page<Taobao> findByPage();
}
