package hashmap;

import java.util.HashMap;

public class hash {
	public static void main (String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("amar",17);
		map.put("sree", 23);
		map.put("thankam", 37);
		int age=map.get("sree");
		System.out.println(age);
		map.remove("amar");
		//System.out.println("amar is removed"+ true);
		System.out.println("hash table"+map);
		boolean containssree=map.containsKey("sree");
		System.out.println(containssree);
		
		
	}

}
