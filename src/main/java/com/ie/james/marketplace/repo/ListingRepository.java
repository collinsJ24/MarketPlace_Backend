package com.ie.james.marketplace.repo;

import com.ie.james.marketplace.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {
}
