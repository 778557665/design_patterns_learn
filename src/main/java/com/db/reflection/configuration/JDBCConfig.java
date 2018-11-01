package com.db.reflection.configuration;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCConfig {

    private Properties contextConfig = new Properties();
    //读取配置文件信息
    public void loadConfigByProperties() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
        contextConfig.load(inputStream);
        System.out.println(contextConfig.getProperty("ip"));
        System.out.println(contextConfig.getProperty("port"));
        System.out.println(contextConfig.getProperty("username"));
        System.out.println(contextConfig.getProperty("password"));
    }


    @Test
    public void test(){
        try {
            loadConfigByProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
