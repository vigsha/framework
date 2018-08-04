package week4.day2;

public class PasswordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		 String password = "Tiger Runs @ The Speed Of 100 km/hour.";
	     int upperCase = 0;
	     int lowerCase = 0;
	     int numberCount = 0;
	    for ( int i = 0; i < password.length() ; i++ ) {
	    	
	                if (Character.isUpperCase(password.charAt(i)))
	                { 
	                	upperCase++; 
	                }
	                else if (Character.isLowerCase(password.charAt(i)))
	                { 
	                	lowerCase++;
	                }
	                else if(Character.isDigit(password.charAt(i)))   
	                { 
	                	numberCount++;
	                }
	                
	            }
	    
	            System.out.printf("Your password contains"+" "+upperCase+" "+"uppercases"+" "+lowerCase+" "+ "lowercases"+" "+numberCount+" "+"digits");
	            System.out.println();
	            int ucase = (upperCase*100/password.length());	            
	            System.out.println("uppercase %" + ucase);
	            int lcase = (lowerCase*100/password.length());	            
	            System.out.println("lowercase %" + lcase);
	            int num = (numberCount*100/password.length());	            
	            System.out.println("number %" + num);          
	            	        
	       }
	
	}


