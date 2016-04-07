package com.example.w3e_52.recviewcarview;

/**
 * Created by w3e-52 on 3/15/16.
 */
public class Persons {


    public String imageId;
    public String id;
    public String name;
    private boolean isSelected;
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
