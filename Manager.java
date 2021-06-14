package venkataWeek5task;
public class Manager {
       int mid;
       String name;
       String shift;
       double salary;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Manager()
    {
        
    }
    public Manager( int mid, String name, String shift,double salary)
    {
        this.mid=mid;
        this.name=name;
        this.salary=salary;
        this.shift=shift;
    }
    
}

   