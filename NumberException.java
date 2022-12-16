package exception;

public class NumberException {
	public static void main(String[] args) {
		int num=Integer.parseInt("jino");
		try {
			System.out.println(num);
		}
		catch (NumberFormatException n) {
			System.out.println(n);
			n.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException i) {
			System.out.println(i);
		}
		catch (ArithmeticException a ) {
			System.out.println(a);
		}
		finally {
			System.out.println("Exceptoin occured or not finnaly will be excuted");
		}
	}

}
