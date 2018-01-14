package com.spring.rest.rest.user;

import javax.xml.crypto.Data;
import java.util.Date;

public class User {
    private Integer ID;
    private String name;
    private Date birthDate;

    private User(){}

    public User(Integer ID, String name, Date birthDate) {
        this.ID = ID;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
