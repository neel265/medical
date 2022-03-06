package com.example.medical.models;

public class admin {
    String adminprofilepic ,adminusername , adminEmail , adminpassword ,adminuserID , adminlastmessge;

    public admin(String adminprofilepic, String adminusername, String adminEmail, String adminpassword, String adminuserID, String adminlastmessge) {
        this.adminprofilepic = adminprofilepic;
        this.adminusername = adminusername;
        this.adminEmail = adminEmail;
        this.adminpassword = adminpassword;
        this.adminuserID = adminuserID;
        this.adminlastmessge = adminlastmessge;
    }

    public admin(){}
    public admin( String adminusername, String adminEmail, String adminpassword) {
        this.adminusername = adminusername;
        this.adminEmail = adminEmail;
        this.adminpassword = adminpassword;
        this.adminuserID = adminuserID;
    }


    public String getAdminprofilepic() {
        return adminprofilepic;
    }

    public void setAdminprofilepic(String adminprofilepic) {
        this.adminprofilepic = adminprofilepic;
    }

    public String getAdminusername() {
        return adminusername;
    }

    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public String getAdminuserID() {
        return adminuserID;
    }

    public void setAdminuserID(String adminuserID) {
        this.adminuserID = adminuserID;
    }

    public String getAdminlastmessge() {
        return adminlastmessge;
    }

    public void setAdminlastmessge(String adminlastmessge) {
        this.adminlastmessge = adminlastmessge;
    }
}
