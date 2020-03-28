
public class DateTest {
	public static void main(String[] args) {
		// Goi ham khoi tao khong tham so
		System.out.println("// Testcase 1:");
		MyDate obj1 = new MyDate();
		obj1.hienThi();

		// Goi ham khoi tao 3 tham so
		System.out.println("// Testcase 2:");
		MyDate obj2 = new MyDate(26, 04, 1999);
		obj2.hienThi();

		// Goi ham nhan input va in ra man hinh
		System.out.println("// Testcase 3:");
		MyDate obj3 = new MyDate();
		obj3.nhap();
		obj3.hienThi();
		
		// Print string Date
		System.out.println("// Testcase 4:");
		MyDate obj4 = new MyDate("second", "September", "twenty nineteen");
		obj4.print();
		
		// Print in specified format
		System.out.println("// Testcase 5:");
		MyDate obj5 = new MyDate();
		obj5.print2();
		
		// Compare two dates
		System.out.println("// Testcase 6:");
		int i = DateUtils.compare(obj2, obj3);
		System.out.print("Date 1: "); obj2.hienThi();
		System.out.print("Date 2: "); obj3.hienThi();
		if (i == 1) System.out.println("Date 1 is after Date 2");
		else if (i == 2) System.out.println("Date 2 is after Date 1");
		else System.out.println("Date 1 & Date 2 are the same");
		
		// Sorting a number of dates
		System.out.println("// Testcase 7:");
		MyDate [] listofDate = {obj1,obj2,obj3};
		DateUtils.sort(listofDate);
		
	}
}
