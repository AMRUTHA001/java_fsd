package Arraylist;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Iterator;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list=new ArrayList<String>();
		list.add("malu");
		list.add("hhf");
		list.remove("malu");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
				

	}

}
