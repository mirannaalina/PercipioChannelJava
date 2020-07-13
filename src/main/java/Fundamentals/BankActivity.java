package Fundamentals;

public interface BankActivity {

    final static int i=20;
    public void deposit();
    public void withdrawal();
    public default void test(){
        System.out.println("version 1");
    }
    public static void getDetails(){

    }
}
