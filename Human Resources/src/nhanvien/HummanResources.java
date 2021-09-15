package nhanvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HummanResources {
    public static void main(String[] args) {
        //Khởi tạo các giá trị cho chương trình chính
        String replay;
        int nhapChucNang,nhapChucVu;
        Staff newStaff;
        String maSV;
        String nameStaff;
        String maDpm;
        String tenDpm;
        int age;
        String dayStart;
        double payRate;
        int dayOff;
        int  overTime;
        Scanner sc = new Scanner(System.in);

        //Thêm thư viện cho lớp Department
        ArrayList<Department> listDepartments = new ArrayList<Department>();
        listDepartments.add(new Department("01","Tech"));
        listDepartments.add(new Department("02","IT"));
        listDepartments.add(new Department("03","Bussiness"));

        //Tạo dữ liệu Nhân viên công ty có sẵn
        ArrayList<Staff> listStaffs = new ArrayList<Staff>();
        listStaffs.add(new Employee("001","Nguyen Van A", listDepartments.get(0) , 28, 1.3, LocalDate.of(2021, 2, 12), 20, 16));
        listStaffs.add(new Employee("002","Nguyen Van B", listDepartments.get(1) , 20, 1.0, LocalDate.of(2021, 1, 1), 12, 20));

        //Phần chương trình chính
        do{
        System.out.println("VUI LONG CHON CAC CHUC NANG DUOI DAY 1-7");
        System.out.println("1. HIEN THI DANH SACH NHAN VIEN HIEN CO TRONG CONG TY");
        System.out.println("2. HIEN THI CAC BO PHAN CONG TY");
        System.out.println("3. HIEN THI NHAN VIEN THEO TUNG BO PHAN");
        System.out.println("4. THEM NHAN VIEN MOI");
        System.out.println("5. TIM KIEM THONG TIN NHAN VIEN THEO TEN HOAC MA NHAN VIEN");
        System.out.println("6. HIEN THI BANG LUONG TOAN CONG TY");
        System.out.println("7. HIEN THI BANG LUON THEO THU TU TANG DAN/GIAM DAN");
        nhapChucNang=sc.nextInt();
        switch(nhapChucNang){
            case 1:
                for(int i=0; i<listDepartments.size();i++){
                    Staff listS = listStaffs.get(i);
                    listS.displayInformation();
                }
            case 2:
                System.out.println("Cac bo phan trong trong cong ty bao gom: ");
                for(int i=0; i<listDepartments.size();i++){
                    Department listD = listDepartments.get(i);
                    listD.show();
                }
            case 3:
                for(int i=0;i<listStaffs.size();i++){
                   // listStaffs[i] == listDepartments.get(i);

                    
                }
                
                
                
                
            case 4:
                System.out.println("Chon them <1> Nhan vien hoac <2> Quan ly");
                nhapChucVu=sc.nextInt();
                switch(nhapChucVu){
                    case 1:
                       newStaff = new Employee();
                       
                    case 2:
                }
            case 5:
            case 6:
            case 7:
        }
        System.out.println("Ban co muon chon lai chuc nang? (Yes/Y) hoac (No/N)");
        replay= sc.next();
       }while(replay.equalsIgnoreCase("Yes")||replay.equalsIgnoreCase("Y"));
        

    }
}