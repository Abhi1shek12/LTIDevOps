package Assignment2;

public class SavingsAccount extends Account{
	int minimumBalence=500;
	
	
	public void displayAccount() {

		System.out.print("\n Your account no. is : " + getAccountNo());
		System.out.print("\n Your account balance is: " + getAccountBalance());
		System.out.print("\n Your Bank name is : " + getBankName());
		System.out.print("\n Minimam Balence should be: " + minimumBalence);
		
		

	}


	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount();
		sa.displayAccount();

	}

}
