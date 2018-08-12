package week8.day2;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String str = "Shanmuga lakshmi";
	        char[] ch = str.toCharArray();
	        /*for (char c : ch )
	        {
	        	System.out.println(c);
	        }
	        */
	        for (int i=ch.length-1; i>=0;i--)
	        {
	        	System.out.println(ch[i]); 		
	        }

}
}
