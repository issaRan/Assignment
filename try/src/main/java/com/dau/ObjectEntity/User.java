package com.dau.ObjectEntity;

import java.util.Date;

public class User {
    private String id;
    private String date;

    public User(String id, String date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }
}
