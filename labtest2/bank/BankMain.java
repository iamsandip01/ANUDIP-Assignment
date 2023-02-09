package labtest2.bank;

public class BankMain {

	public static void main(String[] args) {

		//instance of bank
		Bank a = new BankA(); 
		Bank b = new BankB();
		Bank c = new BankC();
		//printing balance of each banks with getBalance method 
		System.out.println("Balance of Bank A Rs "+a.getBalance());

		System.out.println("Balance of Bank B Rs "+b.getBalance());

		System.out.println("Balance of Bank C Rs "+c.getBalance());

	}

}
