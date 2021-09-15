package nhanvien;
public class Department {
    private String id;
    private String name;
    private int employee = 0;


    public Department() {
    }

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
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

    public int getEmployee() {
        return this.employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
    public void show(){
        System.out.println(getName());
    }
    public void addEmployee(){
        employee +=1;
    }
    @Override
    public String toString() {
        return "{" +
            ", name='" + getName() + "'" +
            "}";
    }
     





     
}


