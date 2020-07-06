package com.company;

public class SMSBundle implements BillAction{
    private double sms;
    private int qty;
    public SMSBundle(double sms, int qty){
        this.sms=sms;
        this.qty=qty;

    }

    public double totalCost() {
        return sms*qty;
    }
}
