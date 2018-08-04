package week3.day2;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows");
		Scanner s1= new Scanner(System.in);
		int row = s1.nextInt();
		s1.close();
		int k=1;
		for (int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"");
			k++;
			}
 		System.out.println();
        }
		
}
}
