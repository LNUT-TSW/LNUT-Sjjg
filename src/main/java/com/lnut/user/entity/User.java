package com.lnut.user.entity;

import com.lnut.common.redis.RedisObj;
import javaz.utils.CommUtil;

import java.util.Map;

public class User implements RedisObj {

    private Integer id;

    private Integer uid;

    private String username;

    private String password;

    private Short type;

    private Short power;

    private static String[] fields = {
            "id",
            "uid",
            "username",
            "password",
            "type",
            "power"
    };

    public int getFieldCount() {
        return fields.length;
    }

    public String getUniqueKey() {
        return "id";
    }

    public Map<String, String> getAllFeildsToHash() {
        return CommUtil.getMap(this, fields);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPower() {
        return power;
    }

    public void setPower(Short power) {
        this.power = power;
    }
}