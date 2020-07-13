package Fundamentals;

public class MyException extends RuntimeException{
    //check exception
    //if you want unchecked, extends from RuntimeException

    public String getMessage(){
        return "custom exp";
    }
}
