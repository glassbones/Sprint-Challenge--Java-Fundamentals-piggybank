package com.ls.piggybank;

import java.util.ArrayList;
import java.util.List;

public class Total {

    public List<Coins> totalCoins = new ArrayList<>();
    //private double sum;

    public Total(){

        totalCoins.add(new Coins("Quarter","Quarters",0.25,1));
        totalCoins.add(new Coins("Dime","Dimes",0.10,1));
        totalCoins.add(new Coins("Dollar","Dollars",1.00,5));
        totalCoins.add(new Coins("Nickel","Nickels",0.05,3));
        totalCoins.add(new Coins("Dime","Dimes",0.10,7));
        totalCoins.add(new Coins("Dollar","Dollars",1.00,1));
        totalCoins.add(new Coins("Penny","Pennies",0.01,10));

    }

    //public void setSum(){ totalCoins.forEach(c -> sum = sum + 1);}
    //public double getSum(){ return sum; }

    public double getSum() {
        double sum = 0;
        for (Coins c: totalCoins) { sum += (c.getValue() * c.getQuantity()); }
        return sum;
    }

}

