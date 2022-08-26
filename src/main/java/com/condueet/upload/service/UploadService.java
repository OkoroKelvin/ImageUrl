package com.condueet.upload.service;


import com.condueet.upload.data.UploadResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public interface UploadService {
    UploadResponseDto uploadImages(MultipartFile file) throws IOException;
}
