package Arraylist;
import java.util.*;

import java.util.ArrayList;

public class target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String sum="0";
		int i;
		ArrayList <Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(10);
		list.add(20);
		list.add(5);
		System.out.println(list);
		for( i=0;i<4;i++)
		{
			for(int j=i+1;j<4;j++)
			{
				if(list.get(i)+list.get(j)==25)
				{
					System.out.println("present");
				}
			}
		}
	}

}
