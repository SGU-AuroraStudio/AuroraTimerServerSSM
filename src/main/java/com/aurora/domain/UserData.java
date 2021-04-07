package com.aurora.domain;

public class UserData {
    private String id;

    private String nickname;

    private String password;

    private String telnumber;

    private String shorttelnumber;

    private String displayurl;

    private Boolean loginstatus;

    private Boolean isleave;

    private byte[] bg;

    public UserData(String id, String nickname, String password, String telnumber, String shorttelnumber, String displayurl, Boolean loginstatus, Boolean isleave, byte[] bg) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.telnumber = telnumber;
        this.shorttelnumber = shorttelnumber;
        this.displayurl = displayurl;
        this.loginstatus = loginstatus;
        this.isleave = isleave;
        this.bg = bg;
    }

    public UserData(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public UserData() { }

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

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    public String getShorttelnumber() {
        return shorttelnumber;
    }

    public void setShorttelnumber(String shorttelnumber) {
        this.shorttelnumber = shorttelnumber == null ? null : shorttelnumber.trim();
    }

    public String getDisplayurl() {
        return displayurl;
    }

    public void setDisplayurl(String displayurl) {
        this.displayurl = displayurl == null ? null : displayurl.trim();
    }

    public Boolean getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(Boolean loginstatus) {
        this.loginstatus = loginstatus;
    }

    public Boolean getIsleave() {
        return isleave;
    }

    public void setIsleave(Boolean isleave) {
        this.isleave = isleave;
    }

    public byte[] getBg() {
        return bg;
    }

    public void setBg(byte[] bg) {
        this.bg = bg;
    }
}