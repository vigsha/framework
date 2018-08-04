package week4.day2;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<100;i++)
		{
		if ((i%3==0)|| (i%5==0))
          {
			System.out.print(i+"|");
			sum+=i;
          }
	    }	
		
		System.out.println("Sum of multiples of 3 and 5 is "+""+ sum);

	}

}
