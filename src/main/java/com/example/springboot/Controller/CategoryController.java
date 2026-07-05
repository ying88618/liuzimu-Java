package com.example.springboot.Controller;

import com.example.springboot.Service.CategoryService;
import com.example.springboot.Service.UserService;
import com.example.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.springboot.pojo.Result;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Result add(@RequestBody @Validated Category category) {
        return categoryService.add(category);
    }

    @GetMapping("/list")
    public Result<List<Category>> list() {
        List<Category> cs = categoryService.list();
        return Result.success(cs);
    }

    @GetMapping("/detail")
    public Result<Category> detail(Integer id) {
        return Result.success(categoryService.detail(id));
    }

    @PutMapping("/update")
    public Result update(@RequestBody @Validated Category category) {
        return categoryService.update(category);
    }

    @PostMapping("/delete")
    public Result delete(Integer id) {
        return categoryService.delete(id);
    }
}