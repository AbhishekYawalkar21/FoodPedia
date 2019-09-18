package com.example.foodpedia;

public class Dishes {
    String dname;
    int dimg;

    public Dishes(String dname, int dimg)
    {
        this.dname=dname;
        this.dimg=dimg;
    }

    public String getDname()
    {
        return this.dname;
    }

    public int getDimg()
    {
        return this.dimg;
    }
}
