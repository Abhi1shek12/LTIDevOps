package Assignment2;
import java.util.*;

public class Account {

	private int accountNo, accountBalance;
	private static String bankName;
	private String accountPassword;

	public int getAccountNo() {

		return accountNo;
	}

	public void setAccountNo(int an) {

		accountNo = an;
	}

	public int getAccountBalance() {

		return accountBalance;
	}

	public void setAccountBalance(int bn) {
		accountBalance = bn;
	}

	public int getbankName() {

		return accountBalance;
	}

	public void setbankName(String bbn) {
		setBankName(bbn);
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	// constructor
	Account() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		accountNo = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter account balance ");
		accountBalance = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter bank name ");
		setBankName(sc2.nextLine());
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Account Password");
		String accountPassword = sc3.next();
		sc.nextLine();
	}

	public void displayAccount() {

		System.out.print("\n Your account no. is : " + accountNo);
		System.out.print("\n Your account balance is: " + accountBalance);
		System.out.print("\n Your Bank name is : " + getBankName());

	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}


}
