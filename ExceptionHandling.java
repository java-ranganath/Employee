package exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		int num=10;
		try {
			
			System.out.println(num/0);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Exception ocured or not finally will be executed");
			
		}
		System.out.println(num);
	}

}
