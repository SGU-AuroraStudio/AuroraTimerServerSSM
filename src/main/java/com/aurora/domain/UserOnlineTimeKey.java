package com.aurora.domain;

import java.util.Date;

public class UserOnlineTimeKey {
    private String id;

    private Date todayDate;

    public UserOnlineTimeKey(String id, Date todayDate) {
        this.id = id;
        this.todayDate = todayDate;
    }

    public UserOnlineTimeKey() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(Date todayDate) {
        this.todayDate = todayDate;
    }
}