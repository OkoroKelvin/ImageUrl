package com.condueet.upload.controller;


import com.condueet.upload.data.UploadResponseDto;
import com.condueet.upload.service.UploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UploadController {

    private final UploadService uploadService;

    @PostMapping(value = "/upload", produces = "application/json")
    public UploadResponseDto saveUsers(@RequestParam(value = "files", required=false) MultipartFile file) throws Exception {
           return uploadService.uploadImages(file);
    }
}
