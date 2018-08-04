package week1.day2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int result;
		System.out.println("Enter the Number : ");
		Scanner scr = new Scanner(System.in);
		int number= scr.nextInt();
		
		for (i=1; i<=10; i++)
		{
			result = number * i;
			System.out.println(i +" * "+ number + "="+ result);
		}
          scr.close();
	}

}
