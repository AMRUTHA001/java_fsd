package Regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class predicate {

	public static void main(String[] args) {
		List <String> names= Arrays.asList("Trivandrum","goa","Thailand","pondicherry");
		names=names.stream().filter(a->a.startsWith("T")).collect(Collectors.toList());
		for( String name: names) {
			
		
		System.out.println("names with t"+names);
		}
		// TODO Auto-generated method stub

	}

}
