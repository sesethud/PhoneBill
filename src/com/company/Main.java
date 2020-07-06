package com.company;




public class Main {

    public static void main(String[] args) {

        PhoneBill phoneBill=new PhoneBill();


        DataBundle dataBundle=new DataBundle(1000);
        phoneBill.accept(dataBundle);
        System.out.println(phoneBill.total());

        PhoneCall phoneCall=new PhoneCall(120);
        phoneBill.accept(phoneCall);
        System.out.println(phoneBill.total());


        SMSBundle smsBundle=new SMSBundle(1.20,10);
        phoneBill.accept(smsBundle);
        System.out.println(phoneBill.total());



    }
}
