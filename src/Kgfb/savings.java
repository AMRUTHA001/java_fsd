package Kgfb;

public  class savings extends account implements maintain{

	public savings(String accno, String cusname, double balance) {
		super(accno, cusname, balance);
	}
	
	@Override
	public float calculatemaintenance(float noofyears) {
		int m=50;
		float maintenancecharge=(m*noofyears)*50;
		return maintenancecharge;
		
	}
}

