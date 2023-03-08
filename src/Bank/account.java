package Bank;

public abstract class account {
	protected int accno;
	protected customer customerobj;
	protected double balance;
	public account(int accno, customer customerobj, double balance) {
		super();
		this.accno = accno;
		this.customerobj = customerobj;
		this.balance = balance;
	}
	 abstract public  boolean  withdraw(double amount);
	
	
		
	
		
	
}
		
	



