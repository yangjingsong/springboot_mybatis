package com.yjs.example.springbootmybatis.controller;

import com.yjs.example.springbootmybatis.Article;
import com.yjs.example.springbootmybatis.mapper.article.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yjs on 2017/12/18.
 */
@RestController
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping("/article")
    public List<Article> getAll(){
        return articleMapper.findAll();
    }

    @RequestMapping("/articleById/{id}")
    public List<Article> getById(@PathVariable String id){
        return articleMapper.findById(id);
    }
}
