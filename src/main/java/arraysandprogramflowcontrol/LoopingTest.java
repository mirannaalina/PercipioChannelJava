package arraysandprogramflowcontrol;

public class LoopingTest {

    public static void main(String[] args) {

        int[] data ={1,2,3,4,5};

        for(int element:data){
            System.out.println("executed:"+element);
        }
        int control =1;
        int control2=0;
        while(control<10){
            System.out.println("executed ="+control);
            control++;
        }

        do{
            System.out.println("executed ="+control2);

            control2++;
        }while(control2<10);

        for(int control3=1;control3<10;control3++){

            System.out.println("executed = "+ control3);
        }




    }
}
