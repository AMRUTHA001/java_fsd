Testing the presence of vowels in a given string.

package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class voweltest {
		@Test
		public void counttesting() {
			String s="amrutha";
			int expected=2;
			int actual=voweltest.counttest(s);
			
			assertEquals(expected,actual);
		}
		
	



public static int counttest(String s) {
    String str = "indiaismy";
    str = str.toLowerCase();
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
            || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u') {
            
            count++;
        }
        

}return count;

}}
