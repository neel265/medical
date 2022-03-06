package com.example.medical.model;

public class dashborad
{
    int profile;
    String tex;

    public dashborad(int profile, String tex) {
        this.profile = profile;
        this.tex = tex;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getTex() {
        return tex;
    }

    public void setTex(String tex) {
        this.tex = tex;
    }
}
