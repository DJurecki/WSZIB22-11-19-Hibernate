package com.jurecki.model;

import java.util.Date;

public class CarHistory {
    private int id;
    private Date date;
    private int newCarId;

    @Override
    public String toString() {
        return "CarHistory{" +
                "id=" + id +
                ", date=" + date +
                ", newCarId=" + newCarId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNewCarId() {
        return newCarId;
    }

    public void setNewCarId(int newCarId) {
        this.newCarId = newCarId;
    }
}
