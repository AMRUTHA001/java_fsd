package ustbatchno3.junit5testcases;
import static org.junit.Assert.*;

import org.junit.Test;

public class add {
	@Test
	
	public void addition() {
		int targer[]= {4,5};
		int expected=9;
		int actual=sumadd.Add();
		assertEquals(expected,actual);
		
	}

	
}
