package com.yjs.example.springbootmybatis;

import java.io.Serializable;

/**
 * Created by yjs on 2017/10/16.
 */


public class Taobao implements Serializable {

    private String user;
    //@Column(name = "PRICE")
    private double price;
    //@Column(name = "IMAGE")
    private String image;
    //@Column(name = "SIGN")
    private String sign;
    //@Column(name = "TITLE")
    private String title;

    //@Column(name = "TIME")
    private String time;

    //@Column(name = "REGION")
    private String region;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}

