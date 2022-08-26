package com.condueet.upload.repository;

import com.condueet.upload.data.ImageUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageUrlRepository extends JpaRepository<ImageUrl, Long> {

}
