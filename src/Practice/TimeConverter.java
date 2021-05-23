package Practice;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String time=sc.next();
		String hh=time.substring(0, 2);
		String zn=time.substring(8);
		int H = Integer.parseInt(hh);
		
		if (zn.equals("AM")) {
			if (H == 12)
				hh = "00";
			else {
				if (H < 10) {
					hh = "0" + H;
				}
			}
		}
		
		else if(zn.equals("PM")){
			if(H==12)
				hh="12";
			else {
				H=H+12;
				hh=Integer.toString(H);
			}
		}
		
		System.out.println(hh+time.substring(2,8));
	}

}
