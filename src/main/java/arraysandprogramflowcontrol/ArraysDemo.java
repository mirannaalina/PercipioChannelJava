package arraysandprogramflowcontrol;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] values = {1,2,3,4};
        int[] values2= new int[3];
        values2[0] = 10;
        values2[1] = 20;
        values2[2] = 30;
        for(int counter =0;counter<values2.length;counter++){
            System.out.println(values2[counter]);
        }

        long array[] =new long[3];

        Arrays.fill(array,30);
        for(int counter=0;counter<array.length;counter++){
            System.out.println(array[counter]);
        }
        //long[] newArray = Arrays.copyOf(array,2);
    }
}
