package Kgfb;

abstract public class account {
	String accno;
	String cusname;
	double balance;
	public account(String accno, String cusname, double balance) {
		super();
		this.accno = accno;
		this.cusname = cusname;
		this.balance = balance;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
