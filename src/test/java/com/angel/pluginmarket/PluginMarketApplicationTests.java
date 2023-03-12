package com.angel.pluginmarket;

import com.angel.pluginmarket.dao.PluginPackageDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class PluginMarketApplicationTests {
    @Autowired
    private PluginPackageDao pluginPackageDao;

    @Test
    void test_find_by_name() {
        System.out.println(pluginPackageDao.findByName("UWP Lint"));
    }

}
