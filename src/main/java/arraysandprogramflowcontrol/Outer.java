package arraysandprogramflowcontrol;

class Outer {

    private int x = 5;

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }

    public void outerMethod() {
        Inner inner = new Inner();
        inner.innerMethod();
    }

    class Inner{
        public void innerMethod(){
        System.out.println("From inner method x= " + x);
    }

    }
}
