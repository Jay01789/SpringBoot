package com.example.URLHitCounter.UrlService;

import org.springframework.stereotype.Service;

@Service
public class UrlService {
    int  num =  0 ;
    public int hitcount() {
        num++;
        return num ;
    }
}
