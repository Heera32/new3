
public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account("546788992222", "Sreedhar");
		account.DisplayAccountInfo();
		System.out.println("*************************");
		
		SavingsAccount savingsaccount= new SavingsAccount(23.08,2000, "54678812144","Heera");
		savingsaccount.DisplayAccountInfo();
		savingsaccount.showDetails();
		System.out.println("*************************");
		
		CurrentAccount currentaccount= new CurrentAccount(20000, "5433221109876", "Geetha");
		currentaccount.DisplayAccountInfo();
		currentaccount.printSDetails();
			
		
	}

}
