package Bank;

public class customer {
	int customerid;
	String customerName;
	String emailid;
	public customer (int customerid,String customerName,String emailid) {
		this.customerid=customerid;
		this.customerName=customerName;
		this.emailid=emailid;
				
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
