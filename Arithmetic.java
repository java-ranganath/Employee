package exception;

public class Arithmetic {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int add=a+b;
		int sub =a-b;
		int div =0;
		//System.out.println(add);
		//System.out.println(sub);
		try {
			 div=a/b;
			
			System.out.println(div);
		}
		catch (Exception e) {
			System.out.println(e+" give valid denominator");
			e.printStackTrace();
		}
		int mul=a*b;
		System.out.println(mul+"multipication value");
		System.out.println(add);
		System.out.println(sub);
	}


}
