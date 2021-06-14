package venkataWeek5task;
public class ItemMain {
    public static void main(String[] args) {
       // Item i1=new Item();
       Item i2=new Item("01","noodle",10.00,"chinese");
       
       System.out.println("Itemid:"+i2.getItemid());
       System.out.println("Dish:"+i2.getDish());
       System.out.println("Price:"+i2.getPrice());
       System.out.println("Category:"+i2.getCategory());
    }
}
