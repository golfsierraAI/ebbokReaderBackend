package com.ebookBackend.controller;

import com.cloudinary.api.ApiResponse;
import com.ebookBackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/get")
    public ApiResponse getData() throws Exception {
        return service.post();
    }
    @GetMapping("/getImages")
    public ApiResponse getImages() throws Exception {
        return service.getImages();
    }
}
