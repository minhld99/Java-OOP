
public class DateUtils {
	public static int compare(MyDate date1, MyDate date2) {
		int i = 0;
		if (date1.getNam() > date2.getNam()) i = 1;
		else if (date1.getNam() < date2.getNam()) i = 2;
		else {
			if (date1.getThang() > date2.getThang()) i = 1;
			else if (date1.getThang() < date2.getThang()) i =2;
			else {
				if (date1.getNgay() > date2.getNgay()) i = 1;
				else if (date1.getNgay() > date2.getNgay()) i = 2;
			}
		}
//		if (i == 1) System.out.println("Date 1 is after Date 2");
//		else if (i == 2) System.out.println("Date 2 is after Date 1");
//		else System.out.println("Date 1 & Date 2 are the same");
		return i;
	}
	
	public static void sort(MyDate [] dates) {
		System.out.println("List of date before sorting:");
		for (int i = 0; i < dates.length; i++)
			dates[i].hienThi();
		
		MyDate temp = new MyDate();
		// insertion sort
		for (int i = 1; i < dates.length; i++)
		    for (int j = i; j > 0; j--)
		    	if (compare(dates[j], dates[j - 1]) == 2) {
		    		temp = dates[j];
		    		dates[j] = dates[j - 1];
		    		dates[j - 1] = temp;
		    	}
		System.out.println("List of date after sorting:");
		for (int i = 0; i < dates.length; i++)
			dates[i].hienThi();
	}
}
