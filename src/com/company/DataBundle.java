package com.company;

public class DataBundle implements BillAction{
    private double total;
    private double megabytes;
    public DataBundle(double megabytes){
        this.megabytes=megabytes;
    }
    public double totalCost(){
        if(megabytes<500){
            total=0.75*megabytes;

        }
        if(megabytes>500 && megabytes<1000){
            total= 0.55*megabytes;
        }
        if(megabytes>=1000){
            total= 0.35*megabytes;
        }
        return total;
    }

}
