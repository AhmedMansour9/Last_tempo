package com.tempomena.Model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.tempomena.Activites.ProductList;


@Keep
public class SubCategories_Model {

    private String cat_ar;
    private String cat_en;
    private String key;
    private String sub_key;
    private String img;

    public SubCategories_Model(){

   }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public SubCategories_Model(String cat_ar, String cat_en, String key, String sub_key, String img) {
        this.cat_ar = cat_ar;
        this.cat_en = cat_en;
        this.key = key;
        this.sub_key = sub_key;
        this.img = img;
    }

    public String getCat_ar() {
        return cat_ar;
    }

    public void setCat_ar(String cat_ar) {
        this.cat_ar = cat_ar;
    }

    public String getCat_en() {
        return cat_en;
    }

    public void setCat_en(String cat_en) {
        this.cat_en = cat_en;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSub_key() {
        return sub_key;
    }

    public void setSub_key(String sub_key) {
        this.sub_key = sub_key;
    }

    @NonNull
    @Override
    public String toString() {
        if(ProductList.Language.equals("en")){
            return cat_en;
        }else {
            return cat_ar;

        }
    }
}
