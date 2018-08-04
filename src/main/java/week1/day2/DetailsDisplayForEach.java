package week1.day2;

public class DetailsDisplayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentName = {"Lakshmi","Vignesh","Nivetha"};
		int[] studentAge = {22,23,25};
		
		for( String nameDisplay: studentName)
		{
			System.out.println(nameDisplay + "-" +nameDisplay.length() );
			//System.out.println(nameDisplay.length());
		}
		
		for( int ageDisplay: studentAge)
		{
			System.out.println(ageDisplay);
			
		}		
		
	}

}