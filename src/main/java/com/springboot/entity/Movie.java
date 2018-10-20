package com.springboot.entity;

import java.util.Date;

/**
 *
 */
public class Movie {

    private String id;
    private String name;
    private Date createDate;
    private Date showDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getShowTime() {
        return showDate;
    }

    public void setShowTime(Date showTime) {
        this.showDate = showTime;
    }
}
