package com.aurora.domain;

import java.util.Date;

public class UserOnlineTime extends UserOnlineTimeKey {
    private Long todayOnlineTime;

    private Date lastOnlineTime;

    public UserOnlineTime(String id, Date todaydate, Long todayOnlineTime, Date lastOnlineTime) {
        super(id, todaydate);
        this.todayOnlineTime = todayOnlineTime;
        this.lastOnlineTime = lastOnlineTime;
    }

    public UserOnlineTime() {
        super();
    }

    public Long getTodayOnlineTime() {
        return todayOnlineTime;
    }

    public void setTodayOnlineTime(Long todayOnlineTime) {
        this.todayOnlineTime = todayOnlineTime;
    }

    public Date getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(Date lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }
}