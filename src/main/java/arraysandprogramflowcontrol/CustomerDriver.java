package arraysandprogramflowcontrol;

public class CustomerDriver {

    public static void main(String[] args) {
        Customer ob =new Customer();
        String[] p = {"p1","p2"};
        ob.setValues(1,"cody",p);
        ob.dispValues();
    }
}
