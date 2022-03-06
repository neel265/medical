package com.example.medical;

public class items {
    private String itemimage;
    private String imageuri;
    private  String des;

    public items() {

    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getItemimage() {
        return itemimage;
    }

    public void setItemimage(String itemimage) {
        this.itemimage = itemimage;
    }

    public String getImageuri() {
        return imageuri;
    }

    public void setImageuri(String imageuri) {
        this.imageuri = imageuri;
    }

    public items(String itemimage, String imageuri,String des) {
        this.itemimage = itemimage;
        this.imageuri = imageuri;
        this.des =des;


    }
}


