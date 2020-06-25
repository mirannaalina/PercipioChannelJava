package OOP3;

import javax.smartcardio.Card;
import java.util.Date;

public class Driver {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccountId(2);
        System.out.println(ac.getAccountId());

        AccountActivity ob = new AccountActivity();
        ob.dispMessage();
        ob.dispMessage("test2");
        ob.dispMessage(100);

        System.out.println(CustomerActions.counter);
        CustomerActions.dispCounter();


        Payment p = new Payment(1,new Date());



    }
}
