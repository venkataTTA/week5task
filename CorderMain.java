package venkataWeek5task;
public class CorderMain {
    public static void main(String[] args) {
     //   Corder c1=new Corder();
   Corder c2=new Corder(001,"laura","47688543","newbury","abc",22,22,"monday");
        System.out.println(" Customer order 1");
        System.out.println("Id :"+c2.getOrderid());
        System.out.println("Name:"+c2.getCname());
        System.out.println("Phone:"+c2.getPhone());
        System.out.println("Address :"+c2.getAddress());
        System.out.println("Itemid:"+c2.getItemid());
        System.out.println("Qty:"+c2.getQty());
        System.out.println("Total :"+c2.getTotal());
        System.out.println("Date :"+c2.getDate());


    }
    
}
