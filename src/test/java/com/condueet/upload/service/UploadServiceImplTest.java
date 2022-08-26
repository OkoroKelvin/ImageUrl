package com.condueet.upload.service;

import com.condueet.upload.data.UploadResponseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UploadServiceImplTest {

    @Autowired
    UploadService uploadService;

   @Test
   @DisplayName("Test that user can upload images")
    void testThatUserCanUploadImages() throws IOException {
//       String filePath = "src/main/resources/IMG_20220820_141428.jpg";
//       File file = new File(filePath);
//       UploadResponseDto responseDto = uploadService.uploadImages(file);
//       assertNotNull(responseDto.getUrl());
   }

}