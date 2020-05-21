package com.tempomena.Model;

import androidx.annotation.Keep;

/**
 * Created by ahmed on 12/12/2017.
 */



@Keep
public class User {
    public String Name;
    public String Password;
    public String Phone;

    public User() {
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
