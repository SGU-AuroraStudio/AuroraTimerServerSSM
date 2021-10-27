package com.aurora.util;

import com.aurora.controller.UserOnlineTimeController;
import com.aurora.domain.base.Constants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Yao
 * @Date 2021/4/17 12:00
 * @Description
 */
public class Util {

    /**
     * 判断是否在工作室
     * 需要在Constants.LOCAL_BG_BASE_PATH设置的目录下创建conf.properties配置文件，属性inAuroraCheck，ipWhiteList，ipBlackList
     * （会不会放interceptor里好点）
     * 如果传入的ip在WhiteList里返回true，在BlackList里返回false，其他情况返回true。不单纯用白名单是因为有可能在工作室连热点计时。（但是这样的话，就可以在宿舍开热点计时了。。。）
     * 要禁止热点和其他的话就改成返回false
     *
     * 配置文件里可以不完全输入，实现模糊匹配，如 219.129.252
     * @return true or false
     */
    public static boolean isInAurora(String uIp) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(Constants.LOCAL_BG_BASE_PATH + "/conf.properties")));
        //如果配置文件里不开启在工作室检测，直接返回true
        if(properties.getProperty("inAuroraCheck").equals("false"))
            return true;

        String[] ipWhiteList = properties.getProperty("ipWhiteList").split("\\|");
        String[] ipBlackList = properties.getProperty("ipBlackList").split("\\|");
        for (String wIp : ipWhiteList) {
            if (uIp.contains(wIp))
                return true;
        }
        for (String bIp : ipBlackList) {
            if (uIp.contains(bIp))
                return false;
        }
        UserOnlineTimeController.logger.warn(" isInAurora(" + uIp + ") 未知ip：" + uIp);
        //要禁止热点和其他的话就改成返回false
        return false;
    }


    /**
     * 在配置文件中获取管理员id，判断传入的id是不是管理员
     *
     * @param id id
     * @return true or false
     */
    public static boolean isAdmin(String id) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(Constants.LOCAL_BG_BASE_PATH + "/conf.properties")));
        //配置文件里用 | 分割每个id
        String[] admins = properties.getProperty("admin").split("\\|");
        for (String admin : admins) {
            if (admin.equals(id))
                return true;
        }
        return false;
    }

    /**
     *
     * @return String
     * @throws IOException
     */
    public static String getIp() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(Constants.LOCAL_BG_BASE_PATH + "/conf.properties")));
        String ip = properties.getProperty("ip");
        return ip;
    }
}
