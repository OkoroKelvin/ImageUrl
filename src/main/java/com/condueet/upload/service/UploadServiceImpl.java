package com.condueet.upload.service;


import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;
import com.condueet.upload.data.ImageUrl;
import com.condueet.upload.data.UploadResponseDto;
import com.condueet.upload.repository.ImageUrlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

@Service
@AllArgsConstructor
public class UploadServiceImpl implements UploadService {

    private final ImageUrlRepository imageUrlRepository;

    @Override
    public UploadResponseDto uploadImages(MultipartFile multipartFile) throws IOException {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "kelvin1405",
                "api_key", "315744438938451",
                "api_secret", "ucJdvxsC8nW6szTpLfVO4xllk2A"));
        File file = convertMultiPartToFile(multipartFile);
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());

        UploadResponseDto responseDto = new UploadResponseDto();
        responseDto.setUrl((String) uploadResult.get("url"));
        ImageUrl imageUrl = new ImageUrl();
        imageUrl.setUrl(responseDto.getUrl());
        imageUrlRepository.save(imageUrl);
        return  responseDto;
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
