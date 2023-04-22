package com.example.URLHitCounter.UrlController;

import com.example.URLHitCounter.UrlService.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {
    @Autowired
    UrlService urlService ;

    @GetMapping(value = "/get/{name}")
    public String hit(@PathVariable String name){
        return  urlService.hitcount() + " URL  Hits By" + " " + name;

    }
}
