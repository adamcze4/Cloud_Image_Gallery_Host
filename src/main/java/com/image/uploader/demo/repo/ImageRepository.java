package com.image.uploader.demo.repo;

import com.image.uploader.demo.model.ImageAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageAddress, Long> {
}
