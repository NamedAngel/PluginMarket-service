package com.angel.pluginmarket.controller;

import com.angel.pluginmarket.pojo.PluginPackage;
import com.angel.pluginmarket.service.PluginManageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "插件管理")
@RequestMapping("/content")
public class PluginManageController {
    private final PluginManageService pluginManageService;

    @Autowired
    public PluginManageController(PluginManageService pluginManageService) {
        this.pluginManageService = pluginManageService;
    }

    @GetMapping("/queryPlugin")
    public List<PluginPackage> queryPlugin(String name) {
        return pluginManageService.queryPlugin(name);
    }
}
