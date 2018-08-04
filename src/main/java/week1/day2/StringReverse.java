package week1.day2;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scr.nextLine();
		String reverse= "";
		
		for (int i = name.length()-1 ; i>=0; i--)
		{
			reverse = reverse+name.charAt(i);
			
		}
		
		System.out.println("Reverse of the string : " + reverse);
		
		scr.close();
	}
	

}
