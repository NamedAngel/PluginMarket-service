package com.angel.pluginmarket.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.InputStream;

@RestController
@RequestMapping("/market")
public class MarketController {
    @GetMapping("/plugins/{file}")
    public void queryPlugin(@PathVariable String file) {
        System.out.println(file);
        InputStream in = getClass().getResourceAsStream("plugins/" + file);
    }

    @GetMapping("/updatePlugins.xml")
    public ResponseEntity<InputStreamResource> getMarket() throws Exception {
        System.out.println("get market");
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_XML)
                .body(new InputStreamResource(new FileInputStream("E:\\project\\PluginMarket-service\\src\\main\\resources\\static\\market\\updatePlugins.xml")));
    }
}
