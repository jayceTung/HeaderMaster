package com.joker.hm.pojo;

public class User {
    private String userId;

    private String password;

    private String nickname;

    public String getUserid() {
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}