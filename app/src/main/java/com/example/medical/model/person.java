package com.example.medical.model;

public class person
{
    int ip;
    String tp;

    public person(int ip, String tp) {
        this.ip = ip;
        this.tp = tp;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
}
