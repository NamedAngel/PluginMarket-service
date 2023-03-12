package com.angel.pluginmarket.service;

import com.angel.pluginmarket.dao.PluginPackageDao;
import com.angel.pluginmarket.pojo.PluginPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PluginManageService {
    private final PluginPackageDao pluginPackageDao;

    @Autowired
    public PluginManageService(PluginPackageDao pluginPackageDao) {
        this.pluginPackageDao = pluginPackageDao;
    }

    public List<PluginPackage> queryPlugin(String name) {
        return pluginPackageDao.findByName(name);
    }
}
