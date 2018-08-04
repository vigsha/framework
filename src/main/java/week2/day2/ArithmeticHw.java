package week2.day2;

import java.util.Scanner;

public class ArithmeticHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the first number");
	    int num = s.nextInt();
	    System.out.println("Enter the second number");
	    int num1 = s.nextInt();	   
	    s.nextLine();
	    System.out.println("Enter the operation");
	    String str = s.nextLine();
	    
	    switch(str)
		{
		case "Add":
			System.out.println("Addition :"+(num+num1));
			break;
		case "Sub":
			System.out.println("Subtraction :"+(num-num1));
			break;
		case "Mul":
			System.out.println("Multiplication :"+(num*num1));
			break;
		case "Div":
			System.out.println("Division : "+(num/num1));
			break;			
			
		}		
		s.close();
		
	    
	}

}
