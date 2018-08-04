package week1.homework;

public class ArithmeticOperation {
	
	int numberOne=10;
	int numberTwo=40;
		
		
	public void addition()
	{
		int add = numberOne+numberTwo;
		System.out.println("Addition :"+ add);
	}
	public int subtraction()
	{
		int sub = numberOne-numberTwo;
		System.out.println("subtraction: "+sub);
		return sub;
	}	

	public int multiply() 
	{
		int mul = numberOne*numberTwo;
		System.out.println("Multiplication : "+mul);
		
	return mul;

	}
	
	public void multiplNumberOneByTwo () 
	{
		int multi = numberOne*2;
		System.out.println("MultiplnmberoneBytwo: "+multi);	
	}
	
	public int divideNumberTwoBy(int dividend) 
	{
		
		int div= dividend/numberOne;
		System.out.println("Divition: "+div);	
		return div;
	}
}
