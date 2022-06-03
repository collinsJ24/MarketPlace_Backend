package com.ie.james.marketplace.repo;

import com.ie.james.marketplace.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
