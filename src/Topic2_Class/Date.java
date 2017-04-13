package Topic2_Class;

import java.util.Scanner;

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	
	public Date(int dd, int mm, int yyyy){
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	public void setDD (int dd){
    	this.dd = dd;
    }
	
	public void setMM (int mm){
    	this.mm = mm;
    }
	
	public void setYYYY (int yyyy){
    	this.yyyy = yyyy;
    }
	
	public int getDD (){
		if (dd >= 1 && dd <= 31  ){
			return dd;
		}
		return 0;
	}
	
	public int getMM (){
		if (mm >= 1 && mm <=12  ){
			return mm;
		}
		return 0;
	}
	
	public int getYYYY (){
		if (yyyy >= 1970 && yyyy <= 2015  ){
			return yyyy;
		}
		return 0;
	}
	
	public void show (){
		if (getDD() == 0 || getMM() == 0 || getYYYY() == 0){
			System.out.println("\t\tEntered incorrectly date!");
			System.out.println("You enter the following dates: " + getDD() + "/" + getMM() + "/" + getYYYY());
		}
		else
		System.out.println("\nYou enter the following dates: " + getDD() + "/" + getMM() + "/" + getYYYY());
	}
	public static void main(String[] args) {
		int d,m,y;
		Scanner in = new Scanner( System.in );
		System.out.println("\t\tDate Test");
		System.out.print("Enter the day: \n>");
		d = in.nextInt();
		System.out.print("Enter the month: \n>");
		m = in.nextInt();
		System.out.print("Enter the year: \n>");
		y = in.nextInt();
		
		Date ob = new Date(03,10,2015);
		
		ob.setDD(d);
		ob.setMM(m);
		ob.setYYYY(y);
		
		ob.show();
		in.close();
	}

}
