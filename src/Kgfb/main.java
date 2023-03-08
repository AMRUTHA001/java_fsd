package Kgfb;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.savings account/n2.current account/nenter your choice");
		int c=sc.nextInt();
		
		System.out.println("enter account number");
		String s=sc.next();
		System.out.println("enter customer name");
		String r=sc.next();
		System.out.println("enter balance amount");
		double p=sc.nextDouble();
		
		System.out.println("no of years");
		int e=sc.nextInt();
	
		maintain obj =new savings(s,r,p);
		maintain objec =new current(s,r,p);
		
		if(c==1) {
			System.out.println(obj.calculatemaintenance(e));
		}
		else {
			System.out.println(objec.calculatemaintenance(e));
		}
		
		
		// TODO Auto-generated method stub

	
	
	
	}

}
