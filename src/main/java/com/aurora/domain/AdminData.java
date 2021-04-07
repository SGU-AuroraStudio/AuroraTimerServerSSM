package com.aurora.domain;

import java.util.Date;

public class AdminData {
    private Integer id;

    private String announcement;

    private String dutylist;

    private Date freetimestart;

    private Date freetimeend;

    public AdminData(Integer id, String announcement, String dutylist, Date freetimestart, Date freetimeend) {
        this.id = id;
        this.announcement = announcement;
        this.dutylist = dutylist;
        this.freetimestart = freetimestart;
        this.freetimeend = freetimeend;
    }

    public AdminData() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement == null ? null : announcement.trim();
    }

    public String getDutylist() {
        return dutylist;
    }

    public void setDutylist(String dutylist) {
        this.dutylist = dutylist == null ? null : dutylist.trim();
    }

    public Date getFreetimestart() {
        return freetimestart;
    }

    public void setFreetimestart(Date freetimestart) {
        this.freetimestart = freetimestart;
    }

    public Date getFreetimeend() {
        return freetimeend;
    }

    public void setFreetimeend(Date freetimeend) {
        this.freetimeend = freetimeend;
    }
}