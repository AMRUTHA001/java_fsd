/**
 * 
 */
package Regularexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Administrator
 *
 */
public static void main(String[] args) {
	
	
public class count {
	List <String>list=new ArrayList<String>();
	List <String> names= Arrays.asList("Trivandrum","goa","Thailand","pondicherry");
	Set<String>unique=new HashSet<String>(list);
	for(String key: unique) {
		System.out.println(key+":"+Collections.frequency(list,key));
	
	


	}

}
}
