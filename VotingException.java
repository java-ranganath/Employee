package exception;

public class VotingException {
	public static void main(String[] args) throws VoteException {
		int age=19;
		if(age>18) {
			System.out.println("Eligible for vote");
		}
		else {
			throw new VoteException ("not Eligible for vote");
		}
	}

}
