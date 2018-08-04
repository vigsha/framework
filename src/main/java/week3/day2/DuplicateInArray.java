package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {13,15,67,88,65,13,99,67,13,65,87,13};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[i]+"");
					break;
				}			
		    }
			
		}
		System.out.println();
		
		Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			for( int j=i+1;j<a.length;j++)
			{
				if(a[j] == a[i])
				{
					dupNumbers.add(a[i]);
				}
				
			}
		}
		System.out.println(dupNumbers);
			
		}

	}

 
