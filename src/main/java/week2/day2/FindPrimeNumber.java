package week2.day2;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Limit : ");
		Scanner scr = new Scanner(System.in);
		int n= scr.nextInt();
		for (int i=2; i<=n; i++)
		{
			int p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					p=1;
				}
			}
			
			if(p==0)
			{
				System.out.println(i);
			}
		}
		scr.close();
	}

}
