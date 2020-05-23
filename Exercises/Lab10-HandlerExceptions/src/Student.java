import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Scanner;

public class Student {
	private int studentID;
	private String studentName;
	private float gpa;
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public static void main(String[] args) throws IllegalBirthDayException, IllegalGPAException {
		// TODO Auto-generated method stub
		Date birthday = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");  
	    String strDate = formatter.format(birthday);  
	    System.out.println(strDate);  
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Nhap thong tin sinh vien");
	    System.out.print("StudentID = ");
	    int id = Integer.parseInt(sc.nextLine());
	    System.out.print("StudentName = ");
	    String name = sc.nextLine();
	    System.out.print("birthday = ");
	    String date = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
			birthday = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        if (!date.equals(sdf.format(birthday))) {
            throw new IllegalBirthDayException();
        }
	    System.out.print("gpa = ");
	    float gpa = Float.parseFloat(sc.nextLine());
	    if (gpa > 4 || gpa < 0) {
	    	throw new IllegalBirthDayException();
	    }
	}
	
}
