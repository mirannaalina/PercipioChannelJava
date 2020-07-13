package Fundamentals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {



        File file =new File("text.txt");
        //file= null;
        try {
            file=null;
            FileOutputStream fos = new FileOutputStream(file);
        }catch (IOException i){
            System.out.println(i.getMessage());
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }finally{
            System.out.println("anyway");
        }
    }
}
