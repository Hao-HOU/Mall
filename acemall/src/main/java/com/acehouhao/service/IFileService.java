package com.acehouhao.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Hao HOU on 2017/8/4.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
