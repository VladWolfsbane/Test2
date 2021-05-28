package com.example.application;

import android.widget.TextView;

public class Data {

    private String number;
    private String timestamp;

    public Data(){

    }

    public Data(String number, String timestamp) {
        this.number = number;
        this.timestamp = timestamp;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
