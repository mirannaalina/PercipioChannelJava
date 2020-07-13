package Fundamentals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());

        list.add("aa");
        list.add("bb");
        list.add("bb");

        System.out.println(list.size());

        Iterator<String> it =list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
