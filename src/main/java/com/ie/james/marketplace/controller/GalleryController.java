package com.ie.james.marketplace.controller;

import com.ie.james.marketplace.entity.Image;
import com.ie.james.marketplace.service.GalleryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("gallery")
public class GalleryController {

    private GalleryService galleryService;

    @Autowired
    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @GetMapping(path="/images")
    public List<Image> getAllImages(){
        List<Image> images = galleryService.getAllImages();
        return images;
    }


}
