package exception;

public class NumbersArray {
	public static void main(String[] args) {
		int[] num= {10,25,30,65,-17,100};
		try {
			System.out.println(num[10]);
		}
		catch (ArithmeticException a) {
			System.out.println(a+"is an arithmetic exception");
			a.printStackTrace();
		}
		catch (NullPointerException n) {
			System.out.println(n+"is an null exception");
			n.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a+" is array index out of bound");
			a.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
