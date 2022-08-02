package com.ie.james.marketplace.service;

import com.ie.james.marketplace.entity.Listing;
import com.ie.james.marketplace.repo.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    @Autowired
    ListingRepository ListingRepository;

    @Autowired
    public GalleryServiceImpl(ListingRepository ImageRepository){
        this.ListingRepository = ListingRepository;
    }

    @Override
    public List<Listing> getAllImages() {
        return ListingRepository.findAll();
    }
}
