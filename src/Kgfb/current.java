package Kgfb;

public class current extends account implements maintain {

	public current(String accno, String cusname, double balance) {
		super(accno, cusname, balance);
	}
	
	@Override
	public float calculatemaintenance(float noofyears) {
		// TODO Auto-generated method stub
		int m=50;
		float maintenancecharge=(m*noofyears)*50;
		return maintenancecharge;
	}

}
