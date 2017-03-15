package com.example.login_registernew;

/**
 * Created by Alvin on 14/03/2017.
 */

public class Event {
    private String title;
    private String date;
    private String time;
    private int owner_id;


    public Event(String title, String date, String time, int owner_id) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.owner_id = owner_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }
}
