package com.company;

//import javax.xml.crypto.Data;

public class PhoneCall implements BillAction{
    private  double callPrice;

    public PhoneCall(double callPrice){
        this.callPrice=callPrice;
    }

    public double totalCost(){
        return callPrice;
    }

}

