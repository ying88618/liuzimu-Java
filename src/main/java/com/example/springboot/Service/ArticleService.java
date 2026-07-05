package com.example.springboot.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.pojo.Article;
import com.example.springboot.pojo.PageBean;

import java.util.List;

public interface ArticleService {

    void add(Article article);


    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId);

    Article detail(Integer articleId);

    void update(Article article);

    void delete(Integer articleId);

    List<Article> search(String halftitle);
}
