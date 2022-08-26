package com.condueet.upload;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cloudinary.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@SpringBootApplication
public class UploadApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(UploadApplication.class, args);
    }

}
