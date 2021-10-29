package com.dinner.Restaurants.Models;

import javax.persistence.*;

@Entity
@Table(name = "RESTAURANTS")        // JPA would assume table name is Restaurant, so we set it explicitly
public class Restaurant {
    // IDENTITY generation type means the persistence provider will
    // auto-assign values when the database identity column is auto_increment.
    // Note that this would not work in an Oracle DB bc no auto_increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cuisine;

    protected Restaurant(){}

    public Restaurant(String name, String cuisine){
        this.name = name;
        this.cuisine = cuisine;
    }

    public Long getId(){ return id; }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine(){
        return cuisine;
    }

    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }
}