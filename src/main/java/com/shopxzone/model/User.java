package com.shopxzone.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    private int id;
    private String name;
    private String age;
    private String mobileNumber;


}
