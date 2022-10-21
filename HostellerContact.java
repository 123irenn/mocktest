package Mocktest;
import java.util.*;
 class Student1{
    protected int studentId,departmentId;
    protected String name,gender,phone;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
   
}
class Hosteller extends Student1{
    private String hostelName;
    private int roomNumber;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}  
}

public class HostellerContact {
	public static Hosteller getHostellerDetails(){
        Scanner sc = new Scanner(System.in);
        Hosteller h = new Hosteller(); 
        
        System.out.println("Enter the Details:");
        
        System.out.println("Student Id");
        h.setStudentId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Student Name");
        h.setName(sc.next());
        
        System.out.println("Department Id");
        h.setDepartmentId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Gender");
        h.setGender(sc.next());
        
        System.out.println("Phone Number");
        h.setPhone(sc.next());
        
        System.out.println("Hostel Name");
        h.setHostelName(sc.next());
        
        System.out.println("Room Number");
        h.setRoomNumber(sc.nextInt());
        //sc.nextLine();
        sc.close();

        return h;
    }
    

	public static void main(String[] args) {
		Hosteller h = getHostellerDetails();
		 Scanner sc = new Scanner(System.in);
        System.out.println("Modify Room Number(Y/N):");
        String val=sc.next();
        if(sc.nextLine().toLowerCase().equals("Y"))
        {
            System.out.println("New Room Number");
            int roomNumber = sc.nextInt();
            
            h.setRoomNumber(roomNumber);
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        if(sc.nextLine().toLowerCase().equals("Y"))
        {
            System.out.println("New Phone Number");
            String phone = sc.next(); 
            h.setPhone(phone);
        }
        sc.close();
       
	}

}
