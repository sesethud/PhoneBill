package test;
import com.company.DataBundle;
import com.company.PhoneBill;
import com.company.PhoneCall;
import com.company.SMSBundle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testClass {

    PhoneBill phoneBill=new PhoneBill();

    @Test
public void testDataBundle(){
    DataBundle dataBundle=new DataBundle(1000);
    phoneBill.accept(dataBundle);
    System.out.println(phoneBill.total());
    assertEquals(350.0,phoneBill.total());

}
@Test
public void testPhoneCall(){

    PhoneCall phoneCall=new PhoneCall(120);
    phoneBill.accept(phoneCall);
    System.out.println(phoneBill.total());
    assertEquals(470.0,phoneBill.total());
}

@Test
public void testSMS(){
    SMSBundle smsBundle=new SMSBundle(1.20,10);
    phoneBill.accept(smsBundle);
    System.out.println(phoneBill.total());
    assertEquals(482.0,phoneBill.total());
}
}
