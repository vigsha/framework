package week1.day2;

public class IncrementdecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1= 10;
		int n2 = ++n1;
		int n3 = n2++ + ++ n1;
		
		System.out.println("increment " + ++n1);
		System.out.println("decrement" + n1--);
		System.out.println("value of n1 : " + n1);
		System.out.println("value of n2 :" + n2);		
		System.out.println("value of n3 :" + n3);
	}

}
