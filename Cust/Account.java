public class Account {

	private String AccountNumber;
	private String AccountHolderNames;
	
	public Account(String accountNumber, String accountHolderNames) {
		AccountNumber = accountNumber;
		AccountHolderNames = accountHolderNames;
	}
	
	public void DisplayAccountInfo()
	{
		System.out.println("Account Number:  " +AccountNumber);
		System.out.println("Account Holder Name:  " +AccountHolderNames);
	}
	
	
}
