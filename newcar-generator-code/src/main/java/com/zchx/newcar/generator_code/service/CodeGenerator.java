package com.zchx.newcar.generator_code.service;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @Auther: 56986
 * @Date: 2019/3/14 13 35
 * @Description:
 */
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 获取当前项目所在路径
        String projectPath = System.getProperty("user.dir");
        // 设置输出文件路径
        gc.setOutputDir(projectPath + "\\newcar-generator-code" + "\\src\\main\\java");
        // 设置作者
        gc.setAuthor("zzm");
        // 是否打开输出目录
        gc.setOpen(false);
        gc.setEntityName("%sEntity");
        gc.setMapperName("%sDao");
        gc.setXmlName("%sDao");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        // 设置全局配置
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        // 数据库地址
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC");
        // 数据库 schema name
        // dsc.setSchemaName("public");
        // 数据驱动
        dsc.setDriverName("com.mysql.jdbc.Driver");
        // 账号 密码
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();

        //改改改改改改改改改改改改改改改改改改

        pc.setModuleName("user");
        pc.setParent("com.zchx.newcar");
        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //设置实体类需要继承的类
        //strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        //设置controller需要继承的类
        //strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        //设置需要包含的表名 可用正则匹配

        //改改改改改改改改改改改改改改改改改
        strategy.setInclude("sys_user");

        // 自定义基础的Entity类，公共字段
        strategy.setSuperEntityColumns("id");
        //【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setEntityTableFieldAnnotationEnable(true);
        strategy.setTablePrefix("sys_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }



}
