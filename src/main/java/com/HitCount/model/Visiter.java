package com.HitCount.model;

public class Visiter {

    private String UserName;
    private int hitcount;

    public Visiter() {
    }

    public Visiter(String userName, int hitcount) {
        UserName = userName;
        this.hitcount = hitcount;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getHitcount() {
        return hitcount;
    }

    public void setHitcount(int hitcount) {
        this.hitcount = hitcount;
    }
}
