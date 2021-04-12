package com.aurora.domain;

public class UserData {
    private String id;

    private String nickname;

    private String password;

    private String displayurl;

    private String bgurl;

    public UserData(String id, String nickname, String password, String displayurl, String bgurl) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.displayurl = displayurl;
        this.bgurl = bgurl;
    }

    public UserData(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDisplayurl() {
        return displayurl;
    }

    public void setDisplayurl(String displayurl) {
        this.displayurl = displayurl == null ? null : displayurl.trim();
    }

    public String getBgurl() {
        return bgurl;
    }

    public void setBgurl(String bgurl) {
        this.bgurl = bgurl == null ? null : bgurl.trim();
    }
}