package arrayList;

public class BankAccountArrList {

	public String name;
	public double balance;

	public BankAccountArrList(String nm, double amt) {
		name = nm;
		balance = amt;
	}

	public void deposit(double dp) {
		balance += dp;
	}

	public void withdraw(double wd) {
		balance = balance - wd;
	}

}
