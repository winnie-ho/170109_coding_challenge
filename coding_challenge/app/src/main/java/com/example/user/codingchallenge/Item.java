package com.example.user.codingchallenge;

/**
 * Created by user on 09/01/2017.
 */
public class Item {
    private String name;
    private Double price;
    private Boolean bogof;

    //Constructor
    public Item(String name, Double price, Boolean bogof){
        this.name = name;
        this.price = price;
        this.bogof = bogof;
    }

    //Getters

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public Boolean getBogof(){
        return this.bogof;
    }


}
