package com.ie.james.marketplace.controller;

import com.ie.james.marketplace.entity.Listing;
import com.ie.james.marketplace.payload.response.MessageResponse;
import com.ie.james.marketplace.repo.ListingRepository;
import com.ie.james.marketplace.service.GalleryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("gallery")
public class GalleryController {

    private static final Logger logger = LoggerFactory.getLogger(GalleryController.class);

    private GalleryService galleryService;

    @Autowired
    private ListingRepository listingRepo;

    @Autowired
    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @GetMapping(path="/listings")
    public List<Listing> getAllImages(){
        List<Listing> listings = galleryService.getAllImages();
        return listings;
    }

    @CrossOrigin
    @PostMapping("/submission")
    public ResponseEntity<?> jobSubmission(@Valid @RequestBody Listing listingSubmission) {
        listingRepo.save(listingSubmission);
        logger.info("Message saved successfully");
        return ResponseEntity.ok(new MessageResponse("Listing saved successfully!"));

    }


}
