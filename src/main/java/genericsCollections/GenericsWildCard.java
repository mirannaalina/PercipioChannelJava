package genericsCollections;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildCard {

    public static void viewDta(List<?> listitems){
        for(Object object:listitems){
            System.out.println(object);
        }
    }
    public static void integerElements(List<? super Integer>dataitems){
        dataitems.add(100);
    }

    public static void main(String[] args) {
        List<String> dataitems = new ArrayList<>();
        dataitems.add("s");
        dataitems.add("2");
        viewDta(dataitems);
        ArrayList<Integer> integerData = new ArrayList<>();
        integerElements(integerData);
        viewDta(integerData);
    }


}
