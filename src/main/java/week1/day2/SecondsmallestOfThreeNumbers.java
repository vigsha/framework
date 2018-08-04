package week1.day2;

import java.util.Scanner;

public class SecondsmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number1 : ");
		Scanner scr = new Scanner(System.in);
		int n1= scr.nextInt();
		
		System.out.println("Enter the Number2 : ");
		Scanner scr1 = new Scanner(System.in);
		int n2= scr1.nextInt();
		
		System.out.println("Enter the Number3 : ");
		Scanner scr2 = new Scanner(System.in);
		int n3= scr.nextInt();
		
		if (n1<n2 && n1>n3) 
		{
			
		System.out.println("Second smallest Number amoung the three numbers is : " + n1);
		
		}
		if (n2<n1 && n2>n3) 
		{			
		System.out.println("Second smallest Number amoung the three numbers is : " + n2);
		}		
		
		else
		{
			System.out.println("No smallest number");
		}
		
		scr.close();
		scr1.close();
		scr2.close();
}
 
}

