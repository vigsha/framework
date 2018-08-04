package week1.homework;

public class AddEvenPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 923;
		boolean flag = false;
		if (num/2 == 0)
		{
			System.out.println(num+"- EvenNumber");
		}
		else {
			System.out.println(num+" - OddNumber");
		}
		
		for (int i= 2; i<=num/2 ; i++) // we are divinding  the number b 2 bcos no number is divisible more than its half
		{
			if (num % i == 0)
				flag = true;
			break;
		}
		if (!flag)
			
			System.out.println(num+"- Prime number");
		else
			
			System.out.println(num+"- Not a Prime number");
		}

	}

