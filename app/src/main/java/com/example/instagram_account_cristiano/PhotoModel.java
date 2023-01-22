package com.example.instagram_account_cristiano;

import android.graphics.drawable.Drawable;

public class PhotoModel {

    public Drawable photo;
    public String type;

    public PhotoModel(Drawable photo, String type) {
        this.photo = photo;
        this.type = type;
    }

    public PhotoModel() {
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
