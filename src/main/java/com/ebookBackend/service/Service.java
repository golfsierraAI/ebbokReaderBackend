package com.ebookBackend.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Cloudinary cloudinaryConfigx;

    public ApiResponse post() throws Exception {
        return cloudinaryConfigx.api().resources(ObjectUtils.asMap("resource_type", "raw"));
    }

    public ApiResponse getImages() throws Exception {
        return cloudinaryConfigx.api().resources(ObjectUtils.asMap("resource_type", "image"));
    }



}
