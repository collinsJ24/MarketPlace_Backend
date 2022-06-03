package com.ie.james.marketplace.service;

import com.ie.james.marketplace.entity.Image;
import com.ie.james.marketplace.repo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    ImageRepository ImageRepository;

    @Autowired
    public GalleryServiceImpl(ImageRepository ImageRepository){
        this.ImageRepository = ImageRepository;
    }

    @Override
    public List<Image> getAllImages() {
        return ImageRepository.findAll();
    }
}
