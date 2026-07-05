package com.example.springboot.Service;

import com.example.springboot.pojo.Result;
import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {
    String upload(MultipartFile file);
}
