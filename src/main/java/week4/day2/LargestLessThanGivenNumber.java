package week4.day2;

import java.util.Scanner;

public class LargestLessThanGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number= s.nextInt();
		System.out.println("Enter the digit");
		int digit = s.nextInt();	
		s.close();		
		while(Integer.toString(number).contains(Integer.toString(digit)))
				{
			number --;
				}
		System.out.println("Largest Number"+" "+"With out digit" + " "+digit+" "+ "is" +" " +number);

	}

}
