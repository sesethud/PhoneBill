package com.company;

import com.company.BillAction;

public class PhoneBill {
    private double currentTotal=0;

    public void accept(BillAction billAction){
        System.out.println("Before increment"+ billAction.totalCost());
        currentTotal=currentTotal+ billAction.totalCost();
        System.out.println("after increment"+currentTotal);
    }
    public double total(){
        return currentTotal;
    }

}
