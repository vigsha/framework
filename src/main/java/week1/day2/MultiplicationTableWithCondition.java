package week1.day2;

import java.util.Scanner;

public class MultiplicationTableWithCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result,i = 0;
		
		System.out.println("Enter the Number of the tabel : ");
		Scanner scr = new Scanner(System.in);
		int number= scr.nextInt();
		
		System.out.println("Enter the Limit : ");
		Scanner scr1 = new Scanner(System.in);
		int limit= scr1.nextInt();
		
		for (i=1; i<=limit; i++)
		{
			result = number * i;
			System.out.println(i +" * "+ number + "="+ result);
		}
          scr.close();
          scr1.close();


	}

}
