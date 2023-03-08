package Bank;

public class savings extends account{

	private double minimumbalance;

	public savings(int accno, customer customerobj, double balance, double minimumbalance) {
		super(accno, customerobj, balance);
		this.minimumbalance = minimumbalance;
	}
	
	
	public boolean withdraw (double amount) {
		
		if(minimumbalance>0) {
			balance=balance-amount;
			System.out.println("balance" + balance);
			return true;
		}
		return false;
}
		
		
	}
	//	super(accno, customerobj, balance);
		// TODO Auto-generated constructor stub
	


	
	
	



