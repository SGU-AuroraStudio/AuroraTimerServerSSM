package com.aurora.domain;

public class UserData {
    private String id;

    private String nickname;

    private String password;

    private String displayurl;

    private byte[] bg;

    public UserData(String id, String nickname, String password, String displayurl, byte[] bg) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.displayurl = displayurl;
        this.bg = bg;
    }

    public UserData(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserData() {
        super();
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

    public byte[] getBg() {
        return bg;
    }

    public void setBg(byte[] bg) {
        this.bg = bg;
    }
}