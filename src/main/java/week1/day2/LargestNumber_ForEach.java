package week1.day2;

public class LargestNumber_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberList = {33,200,1000,2,55};	
		int max = numberList[0];
		
		for( int findTheLargest: numberList)
		{
			if (findTheLargest > max)
			{
				max = findTheLargest;
			}
		}
		
		System.out.println(max);

	}}
