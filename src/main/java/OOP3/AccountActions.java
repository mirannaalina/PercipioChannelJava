package OOP3;

public class AccountActions {
   private int transactionId;
   String sourceAccount;
    String destinationAccount;

    public void transferFund(){

        transactionId=1;
        sourceAccount="1234";
        destinationAccount="5432";
        System.out.println("fund transfered");
    }
}
