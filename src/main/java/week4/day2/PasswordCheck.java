package week4.day2;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Password check");
		String pwd = "Vignesh268";
		
		if(pwd.matches("^(?=.*[0-9]{2,})(?=.*[a-z])(?=.*[A-Z]).*{10,}$"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("failed");
		}

	}

}
