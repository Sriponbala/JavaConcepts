package oops;

class Notes
{
	private final Login login;
	
	Notes(String userid, String password)
	{
		login = new Login(userid, password);
	}
	
	void loginMethod(Notes notes)
	{
		login.successfulAuthentication(notes);
	}
	
	void notes()
	{
		System.out.println("Click here to access the Java notes");
		System.out.println("Click here to access the Python notes");
		System.out.println("Click here to access the C notes");
		
	}
	
	public static void main(String[] args) 
	{
	     Notes notes = new Notes("Sriponbala","@Sri");
	     notes.loginMethod(notes);
     	     
	}

}

class Login
{
	private static String userid , password ;
	
	Login(String userid, String password)
	{
		this.userid = userid;
		this.password = password;
	}
	
	void successfulAuthentication(Notes notes)
	{
		if(userid.equals("Sriponbala") && password.equals("@Sri"))
		{
			System.out.println("Welcome to home page !");
			notes.notes();
		}
		else
		{
			System.out.println("Invalid Userid or Password");
		}
	}
	
}

