package week1.day2;

public class LargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberList = {33,34,100,2,550};
		int max,i;
		max = numberList[0];
		
		for (i=1  ; i< numberList.length; i++)
		{
			if (numberList[i] > max)
			{
				max = numberList[i];
		    } 
		}		
		System.out.println(max);
}
}
