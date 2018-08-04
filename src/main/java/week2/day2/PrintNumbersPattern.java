package week2.day2;

import java.util.Scanner;

public class PrintNumbersPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("Ënter the first number");
   int num1 = s.nextInt();
   System.out.println("Enter the second number");
   int num2 = s.nextInt();
   
   if (((num1%3 == 0) && (num1%5 == 0)) && ((num1%3==0)&& (num2%5==0)))
   {
   System.out.println("output :"+"FIZZ"+"BUZZ");	
   }
   
   else if ((num1%5 == 0) && (num2%5==0))
   {
   System.out.println("out put :"+ "BUZZ");
   }
   else if((num1)%3==0 && (num2)%3==0)
   {
   System.out.println("out put :"+ "FIZZ");
   }
   else
  {
	System.out.println("output :" + num1 +num2 );
	}
   s.close();
 
	}
	
}
