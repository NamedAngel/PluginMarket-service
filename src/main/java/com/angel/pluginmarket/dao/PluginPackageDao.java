package com.angel.pluginmarket.dao;

import com.angel.pluginmarket.pojo.PluginPackage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PluginPackageDao {
    @Select("select * from plugin_package where name = #{name}")
    List<PluginPackage> findByName(String name);

    @Select("select * from plugin_package")
    List<PluginPackage> findAll();

    @Insert("insert into plugin_package values(#{name}, #{version}, #{description})")
    void add(PluginPackage pluginPackage);
}
