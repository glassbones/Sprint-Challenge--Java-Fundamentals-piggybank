package com.ls.piggybank;

import java.util.concurrent.atomic.AtomicLong;

public class Coins {

    //fields
    private static final AtomicLong counter = new AtomicLong();
    private long coinid;
    private String name;
    private String namepural;
    private double value;
    private double quantity;

    public Coins(String name,
                 String namepural,
                 double value,
                 double quantity)
    {
        this.coinid = counter.incrementAndGet(); //maxId++
        this.name = name;
        this.namepural = namepural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getCoinid() {
        return coinid;
    }

    public void setCoinid(long coinid) {
        this.coinid = coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamepural() {
        return namepural;
    }

    public void setNamepural(String namepural) {
        this.namepural = namepural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + name;
    }
}
