package readAndWriteFiles;
// replace all the yourClass values with the name of your banking class 
// the order of your overloaded constructor may need to be changed to lastName, firstName, balance




public class AccountTester {

	// class to test the bank account Class

	public static void main(String args[]) {

		Account c1 = new Account();
		Account c2 = new Account("Smith", "George", 300);
		Account c3 = new Account("Thomas", "Sally", -20); 
		Account c4 = new Account("Jefferson", "Trish", 0);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		c1.setFirstName("Fred");
		c1.setLastName("Booth");
		c1.credit(400);

		String c1Name = c1.getName();
		float c1Balance = c1.getBalance();

		c2.credit(20);
		c3.credit(200);
		c4.credit(40); 

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		c1.debit(60);
		c2.debit(400);
		c3.debit(200);
		c4.debit(20);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		c1.credit(15);
		c2.credit(42);
		c3.credit(23.70f);
		c4.credit(55);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}
}

	 
