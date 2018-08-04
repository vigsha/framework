package week1.day2;

public class PrintAllStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentName = {"Lakshmi","Vignesh","Nivetha"};
		int[] studentAge = {22,23,25};
		char[][] studentGrades = {{'A','B','C','D','E'},{'A','A','A','A','A'},{'B','B','C','D','E'}};
		 
		 int total = 2;
		 int i;
		 
		 for(i=0 ; i<=total; i++)
			 
		 {
		System.out.println(studentName[i]);
		
		System.out.println(studentAge[i]);
		
		System.out.println(studentGrades[i][0]+"," + studentGrades[i][1]+"," + studentGrades[i][2]+"," + studentGrades[i][3]+"," + studentGrades[i][4]);
		
		
	     }

}}
	
