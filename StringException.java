package exception;

public class StringException {
	public static void main(String[] args) {
		String word ="";
		try {
			System.out.println(word.charAt(0));
		}
		catch (ArithmeticException a) {
			System.out.println(a+" is an arithmetic exception");
			a.printStackTrace();
		}
		catch (NullPointerException n) {
			System.out.println(n+" is an null exception");
			n.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e+" is out of  array  boundary ");
			e.printStackTrace();
		}
		catch (Exception m) {
			System.out.println(m);
			m.printStackTrace();
		}
		finally {
			System.out.println("Exception occured or not finally will be executed ");
		}
	}

}
