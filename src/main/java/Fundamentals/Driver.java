package Fundamentals;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
