
public class CurrentAccount extends Account {

	private double fundTransferLimit;

	public CurrentAccount(double fundTransferLimit,String accountNumber, String accountHolderNames) {
		super(accountNumber, accountHolderNames);
		this.fundTransferLimit = fundTransferLimit;
	}
	
	public void printSDetails()
	{
		System.out.println("Fund transfer Limit"+ fundTransferLimit);
	}
}
