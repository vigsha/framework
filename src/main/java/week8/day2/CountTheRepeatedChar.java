package week8.day2;

public class CountTheRepeatedChar {

	public static void main(String[] args) {
		int count =0;
		String str = "Shanmuga lakshmi";
        char[] ch = str.toCharArray();
        /*for (char c : ch )
        {
        	System.out.println(c);
        }*/
        
        for (int i =0 ; i<ch.length; i++) {
        	
        	if(ch[i]=='a')
        	{
        			
        	count ++;
              }
        
        

}
        System.out.println(count);
	}
}

