package week1.day2;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the character");
        Scanner scr = new Scanner(System.in);
        char testResult = scr.next().charAt(0);
		
		switch(testResult)
		{
		case 'P':
			System.out.println("Passed");
			break;
		case 'F':
			System.out.println("Failed");
			break;
		case 'B':
			System.out.println("Blocked");
			break;
		case 'I':
			System.out.println("Invalid");
			break;			
			
		}		
		scr.close();
		
	}

}
