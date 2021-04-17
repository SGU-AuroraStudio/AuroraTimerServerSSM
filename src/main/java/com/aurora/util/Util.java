package com.aurora.util;

import com.aurora.domain.base.Constants;
import org.apache.ibatis.io.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Yao
 * @Date 2021/4/17 12:00
 * @Description
 */
public class Util {

    /**
     * 是否开启在工作室检测
     * @return true or false
     */
    public static boolean ifInAuroraCheck() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(Constants.LOCAL_BG_BASE_PATH + "/conf.properties")));
        return properties.getProperty("inAuroraCheck").equals("true");
    }

    /**
     * 在配置文件中获取管理员id，判断传入的id是不是管理员
     * @param id id
     * @return true or false
     */
    public static boolean isAdmin(String id) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(Constants.LOCAL_BG_BASE_PATH + "/conf.properties")));
        //配置文件里用 | 分割每个id
        String[] admins = properties.getProperty("admin").split("\\|");
        for (String admin : admins) {
            if(admin.equals(id))
                return true;
        }
        return false;
    }
}
