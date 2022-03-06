package com.example.medical.models;

public class user {
    String profilepic ,username , mail , password ,userID , lastmessge;

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getLastmessge() {
        return lastmessge;
    }

    public void setLastmessge(String lastmessge) {
        this.lastmessge = lastmessge;
    }

    public user(String profilepic, String username, String mail, String password, String userID, String lastmessge) {
        this.profilepic = profilepic;
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.userID = userID;
        this.lastmessge = lastmessge;
    }

    public user(){}

    // signup cpnstrotor

    public user( String username, String mail, String password) {
        this.username = username;
        this.mail = mail;
        this.password = password;

    }
}


