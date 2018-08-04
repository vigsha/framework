package week3.day2;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,6,3,2};
		int temp,total=a.length;
		for(int i=0; i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println(a[total-2]);
	}
		

	}


