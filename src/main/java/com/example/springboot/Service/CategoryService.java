package com.example.springboot.Service;

import com.example.springboot.pojo.Category;

import com.example.springboot.pojo.Result;

import java.util.List;

public interface CategoryService {
    Result add(Category category);

    List<Category> list();

    Category detail(Integer id);

    Result update(Category category);

    Result delete(Integer id);
}
