package week1.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reminder=0;
		int sumOfDigit=0;		
		System.out.println("Enter the Number : ");
		Scanner scr = new Scanner(System.in);
		int number= scr.nextInt();
		
		while(number>0)	
		{
		
			reminder = number %10;
			sumOfDigit =sumOfDigit + reminder;
			number = number/10;
		}
			System.out.println("Sum of Digits =" + sumOfDigit);
		scr.close();
		}		

	}

