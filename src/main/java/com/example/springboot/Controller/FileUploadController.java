package com.example.springboot.Controller;

import com.example.springboot.Service.FileUploadService;
import com.example.springboot.pojo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")

public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) {
        String url = fileUploadService.upload(file);
        return Result.success(url);
    }
}
