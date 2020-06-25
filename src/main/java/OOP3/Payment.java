package OOP3;

import java.util.Date;

public class Payment {

    int paymentId;
    Date paymenntDate;

    public Payment(int paymentId, Date paymenntDate){
        super();
        this.paymentId=paymentId;
        this.paymenntDate=paymenntDate;
    }

    public Payment(){}

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymenntDate() {
        return paymenntDate;
    }

    public void setPaymenntDate(Date paymenntDate) {
        this.paymenntDate = paymenntDate;
    }



    public void dispPaymentDetails(){

    }
}
