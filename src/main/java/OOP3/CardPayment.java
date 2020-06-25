package OOP3;

import java.util.Date;

public class CardPayment extends Payment {
    String cardnNumber;
    String cvv;
    double amount;

    public CardPayment(int paymentId, Date paymenntDate, String cardnNumber, String cvv, double amount) {
        super(paymentId, paymenntDate);
        this.cardnNumber = cardnNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    public CardPayment(String cardnNumber, String cvv, double amount) {
        this.cardnNumber = cardnNumber;
        this.cvv = cvv;
        this.amount = amount;
    }


    public void dispPaymentDetails(){
        System.out.println("Ds");
        System.out.println(paymentId);
    }
}
