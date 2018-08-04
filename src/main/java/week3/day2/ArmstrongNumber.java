package week3.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      for (int i=100;i<1000;i++)
      {
    	int m=i,r,s=0;
		while(m>0)
		{ 
			r = m%10;
			s=s+r*r*r;
			m =m/10;			
		}
      
		if(i==s)
		{
			System.out.println("Armstrong number is " + i);
		}
	
	}

	}
	}
