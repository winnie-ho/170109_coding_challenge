package com.example.user.codingchallenge;

import java.util.ArrayList;

/**
 * Created by user on 09/01/2017.
 */
public class Basket {
    private ArrayList<Item> basket;

    //Constructor
    public Basket () {
        this.basket = new ArrayList<Item>();
    }

    //Getters
    public ArrayList getBasket(){
        return this.basket;
    }

    //Methods
    public void addItem(Item item){
        if (item.getBogof()==false) {
            basket.add(item);
        }
        else if (item.getBogof() == true){
            basket.add(item);
            basket.add(item);
        }
    }

    public void removeItem(Item item){
        if (item.getBogof()==false){
            basket.remove(item);
        }
        else if (item.getBogof()==true){
            basket.remove(item);
            basket.remove(item);
        }

    }

    public void emptyBasket(){
        basket.clear();
    }

    public int basketSize(){
        return basket.size();
    }

    public double valueOfBasket(){
        double value = 0.00;
        for (Item item : basket){
            if(item.getBogof()==false) {
                value += item.getPrice();
            }
            else if (item.getBogof()==true){
                value += item.getPrice()/2;
            }
        }
        if (value > 20.00){
            value-=(value*0.1);
        }
        return value;
    }

    public double loyaltyDiscount(double value){
        return (value * 0.98);
    }
}
