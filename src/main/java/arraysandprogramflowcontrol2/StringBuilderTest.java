package arraysandprogramflowcontrol2;

public class StringBuilderTest {
     public static void main(String[]args){

         StringBuilder ob =new StringBuilder(10);

         System.out.println(ob.capacity());
         System.out.println(ob.append("hello bdgdsgg"));
         System.out.println(ob.capacity());
         System.out.println(ob.reverse());
     }


}