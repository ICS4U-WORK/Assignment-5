package readAndWriteFiles;
/**
 * 
 */


/**
 * @author macdja38
 *
 */
public class Account {

	/**
	 * Creates a bank account, default names are first and last, account opens with 0$
	 */
	public Account() {
		this("First","Last", 0f);
	}

	/**
	 * Creates account with specific name and money
	 * @param string First name 
	 * @param string2 Last name
	 * @param d Balance
	 */
	public Account(String string, String string2, float d) {
		FirstName = string;
		LastName = string2;
		if(d >= 0) {
			Balance = d;
		} else {
			Balance = 0;
			System.out.println("initial value is invalid");
		}
		
	}
	
	public float getBalance() {
		return Balance;
	}

	public void setBalance(float balance) {
		this.Balance = balance;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}
	
	/**
	 * Changes client's last name to lastName
	 * @param lastName string to set client's last name to.
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	/**
	 * Increases client's balance by d
	 * @param d value to increase clien't balance by
	 */
	public void credit(float d) {
		Balance += d;
		System.out.println("$" + d + " given to " + FirstName + " " + LastName);
	}
	
	/**
	 * removed balance from client's account
	 * @param d balance to remove
	 */
	public void debit(float d) {
		if(d<=Balance) {
			Balance -= d;
			System.out.println("$" + d + " taken from " + FirstName + " " + LastName);
		}
		else {
			System.out.println("Funds not available");
		}
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return FirstName + LastName;
	}
	
	public String toString() {
		return "My Name is " + FirstName + " " + LastName + " and I have $" + Balance;
	}
	
	private
		float Balance;
		String FirstName;
		String LastName;

}
