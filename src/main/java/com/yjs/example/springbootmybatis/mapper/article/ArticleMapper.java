package com.yjs.example.springbootmybatis.mapper.article;

import com.yjs.example.springbootmybatis.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yjs on 2017/12/18.
 */
@Component
//@Mapper
public interface ArticleMapper {

    //@Select("select * from article")
//    @Results({
//            @Result(property = "username",column = "username")
//    })
    List<Article> findAll();

    List<Article> findById(String id);


}
