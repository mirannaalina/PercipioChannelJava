package Fundamentals;



public class Driver {

    public static void main(String[] args) {
        BOABankActivity activity= new BOABankActivity();
        activity.deposit();
        activity.withdrawal();
        BankActivity.getDetails();

        UseException ex = new UseException();
        ex.testExp();


    }
}
