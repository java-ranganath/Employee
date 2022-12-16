package exception;

public class StringsException {
	public static void main(String[] args) throws LogInException {
		String username="admin";
		String password="0123";
		try {
		if(username.equals("admin")&&password.equals("0125")) {
			System.out.println("The username and password are correct");
		}
		/*else {
			throw new LogInException("login failed");
		}*/
		else {
			throw new NullPointerException("not admin");
		
		}
	}
		catch(NullPointerException n) {
			System.out.println(n.getMessage());
		
	}

}
}