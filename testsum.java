package ustbatchno3.junit5testcases;

import java.util.Arrays;

import org.junit.Test;

public class testsum {
	@Test
	public void sum() {
		
		int expected=8;
		sum a=new sum();
		int output=a.sum(4,4);
		
		assertEquals(expected,output);
		
		
		
	}
	
	

}
