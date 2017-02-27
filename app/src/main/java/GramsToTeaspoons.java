package com.example.startgazer.sugartracker;

/**
 * Created by StartGazer on 2/24/2017.
 */

public class GramsToTeaspoons implements Converter{
    private double grams = 0;
    @Override
    public double getTeaspoons() {
        return grams/4;
    }

    @Override
    public void setGrams(double grams) {
        this.grams = grams;
    }
}
