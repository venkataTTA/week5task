package venkataWeek5task;
public class ManagerMain {
    public static void main(String[] args) {
        
         Manager m1=new Manager(101,"sreedhar","am",35000);
        System.out.println("Manager 1");
        System.out.println("Id :"+m1.getMid());
        System.out.println("Name:"+m1.getName());
        System.out.println("Shift:"+m1.getShift());
        System.out.println("Salary :"+m1.getSalary());
        Manager m2=new Manager(2,"Nibhahitha","pm",35000);
        System.out.println("Manager 1");
        System.out.println("Id :"+m2.getMid());
        System.out.println("Name:"+m2.getName());
        System.out.println("Shift:"+m2.getShift());
        System.out.println("Salary :"+m2.getSalary());
       // Manager m3=new Manager();
    }
    
}
