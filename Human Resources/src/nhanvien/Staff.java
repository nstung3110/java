package nhanvien;
import java.time.LocalDate;

public abstract class Staff {
    private String id, name;
    private Department department;
    private int age,numDayOff;
    private double payRate;
    private LocalDate startDate;
    
    public Staff() {
        
    }
 
    public Staff(String id,String name,Department department, int age,double payRate,LocalDate startDate,int numDayOff) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.payRate = payRate;
        this.startDate=startDate;
        this.numDayOff=numDayOff;
        
        
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumDayOff() {
        return this.numDayOff;
    }

    public void setNumDayOff(int numDayOff) {
        this.numDayOff = numDayOff;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    
    
    abstract void displayInformation();
   
   
    
    //public long calculateSalary() {
    //   return 0;
    //}
    // 

    @Override
    public String toString() {
        return "{" +
            " Ma Nhan Vien: '" + getId() + "'" +
            ", Ho va Ten '" + getName() + "'" +
            ", Bo Phan Lam Viec: " + getDepartment() + "'" +
            ", age='" + getAge() + "'" +
            ", So Ngay Nghi Phep: '" + getNumDayOff() + "'" +
            ", He So Luong: '" + getPayRate() + "'" +
            ", Ngay Vao Lam: '" + getStartDate() + "'" +
            "}";
    }
    
}


