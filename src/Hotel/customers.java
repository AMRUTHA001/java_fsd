package Hotel;

public class customers {
	int regid;
	String name;
	String phno;
	String emailid;
	String location;
	public customers(int regid, String name, String phno, String emailid, String location) {
		super();
		this.regid = regid;
		this.name = name;
		this.phno = phno;
		this.emailid = emailid;
		this.location = location;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "customers [regid=" + regid + ", name=" + name + ", phno=" + phno + ", emailid=" + emailid
				+ ", location=" + location + "]";
	}
	

}
