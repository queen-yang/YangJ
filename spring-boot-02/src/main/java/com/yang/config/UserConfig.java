package com.yang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "user")
public class UserConfig {
    private String abc;
    private String sex;
    public String getABC() {
        return abc;
    }
    public void setABC(String ABC) {
        this.abc = ABC;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}
