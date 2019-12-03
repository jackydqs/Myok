package com.zking.oa.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Controller
public class UploadAndDownloadController {

    String saveFile = "d:\\study\\";

    @RequestMapping("/upload")
    public String upload() {

        return "upload";
    }

    @PostMapping("/toupload")
    public String toUpload(MultipartFile img, HttpSession session) throws Exception {
        String newFileName = UUID.randomUUID().toString().replace("-", "");
        //上传文件的名称
        File file = new File(saveFile + newFileName);
        img.transferTo(file);
        String fileName = img.getOriginalFilename();
//        session.setAttribute("filename",fileName);
//        System.out.println(fileName);

        return "redirect:/upload";
    }
    @RequestMapping("/downloadFile2")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws IOException {
        // 需要下载的文件
//        System.out.println(imgcs.getOriginalFilename());
        File file = new File("D:\\image\\5.jpg");
        byte[] body = null;
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
        return entity;
    }




}