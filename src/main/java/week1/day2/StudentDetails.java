package week1.day2;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] studentName = {"Lakshmi","Vignesh","Nivetha"};
		int[] studentAge = {22,23,25};
		char[][] studentGrades = {{'A','B','C','D','E'},{'A','A','A','A','A'},{'B','B','C','D','E'}};
		System.out.println("whose name you want to print");
		Scanner scr = new Scanner(System.in);
		int index= scr.nextInt();
		 index = index-1;
		
		System.out.println(studentName[index]+" who is"+studentAge[index]+" years Old Scored"+" "+	studentGrades[index][0]+" , "+studentGrades[index][1]+" , "+studentGrades[index][2]+" , "+studentGrades[index][3]+" , "+studentGrades[index][4]);	
		
		scr.close();

	}

}
