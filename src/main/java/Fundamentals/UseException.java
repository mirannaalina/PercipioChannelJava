package Fundamentals;


public class UseException {

    public void testExp() throws MyException{
        if(true) throw new MyException();
    }
}
