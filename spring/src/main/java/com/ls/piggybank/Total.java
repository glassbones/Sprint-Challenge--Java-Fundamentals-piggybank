package com.ls.piggybank;

import java.util.ArrayList;
import java.util.List;

public class Total {

    public List<Coins> totalCoins = new ArrayList<>();

    public Total(){

        totalCoins.add(new Coins("Quarter","Quarters",0.25,1));
        totalCoins.add(new Coins("Dime","Dimes",0.10,1));
        totalCoins.add(new Coins("Dollar","Dollars",1.00,5));
        totalCoins.add(new Coins("Nickel","Nickels",0.05,3));
        totalCoins.add(new Coins("Dime","Dimes",0.10,7));
        totalCoins.add(new Coins("Dollar","Dollars",1.00,1));
        totalCoins.add(new Coins("Penny","Pennies",0.01,10));

    }


}

