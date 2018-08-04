package week3.day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the year");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if( (year%4==0) && (year%100!=0)|| year%400 ==0)
		{
			System.out.println("Leapyear");
		}
		else
		{
			System.out.println("Not a Leap year"); 
			
		}
		s.close();
	}

}
