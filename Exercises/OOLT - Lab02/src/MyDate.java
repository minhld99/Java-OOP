import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyDate {

   private int ngay; // 1-31
   private int thang; // 1-12
   private int nam;   // > 0
   private String[] date = new String[3]; // store date as string

   // Ham khoi tao khong tham so
   public MyDate()
   {
		Calendar cal = Calendar.getInstance(); // Ngay thang nam hien tai
		setNgay(cal.get(Calendar.DAY_OF_MONTH));
		setThang(cal.get(Calendar.MONTH) + 1);
		setNam(cal.get(Calendar.YEAR));
   }

    // Ham khoi tao 3 tham so ngay, thang va nam
    public MyDate(int d, int m, int y)
    {
    	setNgay(d);
    	setThang(m);
    	setNam(y);
    }
    
    public MyDate(String d, String m, String y) {
    	setNgay(d);
    	setThang(m);
    	setNam(y);
    }

    public void setNgay(int ng){
    	ngay = ng;
    }
    public void setNgay(String ng) {
    	date[0] = ng;
    }
    
    public void setThang(int th){
    	thang = th;
    }
    public void setThang(String th) {
    	date[1] = th;
    }

    public void setNam(int n){
    	nam = n;
    }
    public void setNam(String n) {
    	date[2] = n;
    }

    public int getNgay(){
    	return ngay;
    }

    public int getThang(){
    	return thang;
    }

    public int getNam(){
    	return nam;
    }

    public void nhap(){
    	String strNgay, strThang, strNam;
    	int iNgay, iThang, iNam;
    	Scanner sc = new Scanner(System.in); 
    	
    	do {
	    	System.out.print("Nhap ngay: ");
    		strNgay = sc.nextLine();
	    	iNgay = Integer.parseInt(strNgay);
	    } while (iNgay < 1 || iNgay > 32);
    	
    	do {
    		System.out.print("Nhap thang: ");
    		strThang = sc.nextLine();
    		iThang = Integer.parseInt(strThang);
    	} while (iThang < 1 || iThang > 12);
    	
    	do {
    		System.out.print("Nhap nam: ");
    		strNam = sc.nextLine();
    		iNam = Integer.parseInt(strNam);
    	} while (iNam < 0);
    	
    	try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            df.setLenient(false);
            df.parse(strNgay+"-"+strThang+"-"+strNam);
            setNgay(iNgay); setThang(iThang); setNam(iNam);
        } catch (ParseException e) {
        	System.out.println("Invalid date!");
        }
   }
    
    public void hienThi(){
    	Calendar cal = Calendar.getInstance();
    	cal.set(getNam(), getThang() - 1, getNgay());

    	System.out.println(((cal.get(Calendar.DAY_OF_WEEK)==1)? 
    					"Chu nhat": "Thu " 
    					+ cal.get(Calendar.DAY_OF_WEEK))
  	  	  				+ ", ngay " + getNgay() + "/" 
  	  	  				+ getThang() + "/" + getNam());
    }
    // Print date string
    public void print() {
    	System.out.println(date[0] + ", " + date[1] + ", " + date[2]);
    }
    // Print in specified format 
    public void print2() {
    	Scanner sc = new Scanner(System.in);    
    	// String ==> Date1
    	final String FORMAT1 = "dd/MM/yyyy";
    	System.out.println("Please input the date exactly with format " + FORMAT1);
    	String strDate1 = sc.nextLine();
    	DateFormat df = new SimpleDateFormat(FORMAT1);
    	df.setLenient(false); // set false để kiểm tra tính hợp lệ của date. VD: tháng 2 phải có 28-29 ngày, năm có 12 tháng,....
    	try {
    		Date date1 = df.parse(strDate1); // parse dateString thành kiểu Date
    		System.out.println("date = " + date1);
    	}
    	catch (ParseException e) { // quăng lỗi nếu dateString ko hợp lệ
    		System.out.println("Invalid date!");
    	}
    	// String ==> Date2
    	final String FORMAT2 = "yy-MM-dd";
    	System.out.println("Please input the date exactly with format " + FORMAT2);
    	String strDate2 = sc.nextLine();
    	DateFormat df2 = new SimpleDateFormat(FORMAT2);
    	df2.setLenient(false);
    	try {
    		Date date2 = df2.parse(strDate2); // parse dateString thành kiểu Date
    		System.out.println("date = " + date2);
    	}
    	catch (ParseException e) { //  lỗi nếu dateString ko hợp lệ
    		System.out.println("Invalid date!");
    	}
    }
}

