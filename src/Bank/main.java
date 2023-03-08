package Bank;

public class main {

	public static void main(String[] args) {
		customer c=new customer(65,"malu","hdhhdx@gxdh.com");
		savings s=new savings(678,c,63773.0,88833.0);
		System.out.println(s.withdraw(45.0));
		
		// TODO Auto-generated method stub

	}

}
