package arraysandprogramflowcontrol2;

public class Customer {

    int custId;
    String customerName;
    String[] productNames;

    public void setValues(int cid, String cname, String []pnames){
        custId=cid;
        customerName=cname;
        productNames=pnames;
    }

    public void dispValues(){
        System.out.println(custId);
        System.out.println(customerName);
        for(int counter=0;counter<productNames.length;counter++) {
            System.out.println(productNames[counter]);
        }
    }
}
