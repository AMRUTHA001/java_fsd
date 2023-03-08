package salary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Salarymain {

	public static void main(String[] args) {
		employee m1=new employee("123", "Aadil", 200000);
		employee m2=new employee("113", "Sasi", 2000);
		employee m3=new employee("103", "Kundara", 70000);
		List<employee> list=Arrays.asList(m1,m2,m3);
		List<employee> lis = list.stream().sorted(Comparator.comparing(employee::getSalary).reversed())
				.peek(k->{
				if((k.getSalary()>=50000)&&(k.getSalary()<100000))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if(k.getSalary()>=100000)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
				
		
					 
		System.out.println(lis);
		
	}

}

