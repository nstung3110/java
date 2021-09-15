package nhanvien;

import java.time.LocalDate;

public class Manager extends Staff implements ICalculator  {
    private long salary;
    private int positionCode;
    private String position;
    private static final long SALARY_STAFF = 5000000;


    public Manager() {
    }

    public Manager(long salary, int positionCode) {
        this.salary = salary;
        this.positionCode = positionCode;
    }
    
    //pu

    public Manager(String id,String name,Department department, 
    int age,double payRate,LocalDate startDate,int numDayOff,String position) {
    super();
    this.position=position;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getPositionCode() {
        return this.positionCode;
    }

    public void setPositionCode(int positionCode) {
        this.positionCode = positionCode;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    
    
    
    @Override
    public void displayInformation() {
        System.out.println(this.toString());
        
    }

    
    @Override
    public long calculateSalary() {
        long managerSalary= 0;
        switch(this.positionCode){
            case 1:
            //Business Leader
                position="Business Leader";
                managerSalary= 4_000_000;
                break;
            case 2:
            // ProjectLeader
                position="ProjectLeader";
                managerSalary= 5_000_000;
                break;
            case 3:
            //Tech Leader
                position="Tech Leader";
                managerSalary= 2_000_000;
                break;
                default: managerSalary=0;
            
        }
        salary=(long)super.getPayRate()*SALARY_STAFF+managerSalary;
        return salary;
       
    }
    @Override
public String toString() {
    return "{" +
        " Luong quan ly: '" + getSalary() + "'" +
        ", Vi tri: '" + getPosition() + "'" +
        "}";
    }
    
    
}
