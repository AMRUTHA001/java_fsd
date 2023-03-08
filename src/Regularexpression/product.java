/**
 * 
 */
package Regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class product{
	public static void main(String[] args) {
		List <test> a =new ArrayList<test>();
		a.add(new test(1,"hp",45000));
		a.add(new test(2,"dell",20000));
		a.add(new test(3,"sony",3500));
		List<Integer> product =a.stream().filter(p->p.price>10000).map(p->p.price).collect(Collectors.toList());
		
			System.out.println(product);
		}
		// TODO Auto-generated method stub

	}


