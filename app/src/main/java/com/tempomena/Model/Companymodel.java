package com.tempomena.Model;

import androidx.annotation.Keep;

/**
 * Created by HP on 03/07/2018.
 */

public class Companymodel {
    private String img1;
    private String img2;

    public Companymodel() {
    }

    public Companymodel(String img1, String img2) {
        this.img1 = img1;
        this.img2 = img2;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }
}
