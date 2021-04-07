package com.aurora.domain;

import java.util.Date;

public class UserOnlineTimeKey {
    private String id;

    private Date todaydate;

    public UserOnlineTimeKey(String id, Date todaydate) {
        this.id = id;
        this.todaydate = todaydate;
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

    public Date getTodaydate() {
        return todaydate;
    }

    public void setTodaydate(Date todaydate) {
        this.todaydate = todaydate;
    }
}