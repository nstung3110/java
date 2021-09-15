package nhanvien;

import java.time.LocalDate;
import java.util.Scanner;

public class Employee extends Staff implements ICalculator{
    private int overTimeHour;
    private long salary;
    private static final long SALARY_STAFF = 3000000;
    private static final long SALARY_OVER_TIME = 200000;
    Scanner sc = new Scanner(System.in);
    public Employee() {
        super();
    }
 
    public Employee(String id,String name,Department department, int age,double payRate,LocalDate 
startDate,int numDayOff,int overTimeHour) {
    super(id, name, department,age,payRate, startDate, numDayOff);
    this.overTimeHour=overTimeHour;
    }

    public int getOverTimeHour() {
        return this.overTimeHour;
    }

    public void setOverTimeHour(int overTimeHour) {
        this.overTimeHour = overTimeHour;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
   @Override
    public long calculateSalary(){
       salary=(long)super.getPayRate()*SALARY_STAFF+(long)this.overTimeHour*SALARY_OVER_TIME;
       return salary;
    }
    
    @Override
    public void displayInformation(){
        System.out.println(this.toString());
    }
    

    @Override
    public String toString() {
        return "{" + " Ma Nhan Vien: '" + getId() + "'" +
        ", Ho va Ten '" + getName() + "'" +
        ", Bo Phan Lam Viec: " + getDepartment() + "'" +
        ", Tuoi: '" + getAge() + "'" +
        ", So Ngay Nghi Phep: '" + getNumDayOff() + "'" +
        ", He So Luong: '" + getPayRate() + "'" +
        ", Ngay Vao Lam: '" + getStartDate() + "'" 
         + " overTimeHour='" + getOverTimeHour() + "'" +
            "}";
    }
    
    
    
    
    

	//@Override
	//void displayInformation() {
	//	// TODO Auto-generated method stub
	//	
	//}
}
