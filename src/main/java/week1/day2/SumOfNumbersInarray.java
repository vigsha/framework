package week1.day2;

public class SumOfNumbersInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nL = {13,25,9,56,54,89,17};
		int i,sum=0;
		
		for(i=1; i<nL.length; i++)
		{			
			 sum = nL[0]+nL[i];
			
			nL[0]= sum;
			
		}
		
		System.out.println("sum of the elememts in an array : " + sum);
	}

}
