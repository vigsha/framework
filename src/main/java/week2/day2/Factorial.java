package week2.day2;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number to find factorial");
    int num = s.nextInt();
    
    for (int i=1; i<=num; i++)
    {
    	fac= fac*i;
    }
    s.close();
    
    System.out.println("Factorial is :" + fac);
	}	
 
}
