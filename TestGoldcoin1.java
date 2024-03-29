Test to find employee who joined in organization within 80 days starting jan1 he received 5 gold coins.the employee who joined in the period of 172 days get 3 gold coins.employee joined after 266 days got 1 gold coin.after join they didnt get any gold coin.




package ustbatchno3.junit5testcases;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class TestGoldcoin1{
	.
		@Test
		public void goldcoin() {
			List<Integer> names=Arrays.asList(80,172,266,365);
			
			//date declaration
		LocalDate dateBefore = LocalDate.of(2017, Month.MAY, 24);
		LocalDate dateAfter = LocalDate.of(2017, Month.JULY, 29);
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
	
//		List<Integer> getNumbersUsingIntStreamRange(integer start, int end) {
//		IntStream.range(start, end).boxed().collect(Collectors.toList());
//		TreeMap<BigDecimal,String> ranges = new TreeMap<>();
		
//		ranges.put(BigDecimal.ZERO,        " 0 - 80");
//		ranges.put(BigDecimal.valueOf(81), "81 - 172");
//		ranges.put(BigDecimal.valueOf(172), "172 - 266");
//		ranges.put(BigDecimal.valueOf(267),">= 267 ");
		


		IntStream stream = IntStream.range(0, 80);
		IntStream stream1 = IntStream.range(81, 172);
		IntStream stream2= IntStream.range(173, 266);
		IntStream stream3 = IntStream.range(267, 365);
		 

	
		
			long expected=5;
			long expected1=3;
			long expected2=2;
			long expected3=0;
			
			long actual=goldcoin.test(noOfDaysBetween,stream);
			long actual1=Goldcoin.test1(noOfDaysBetween,stream1);
			long actual2=Goldcoin.test2(noOfDaysBetween,stream2);
			long actual3=Goldcoin.test3(noOfDaysBetween,stream3);
			
			assertEquals(expected,actual);
			assertEquals(expected1,actual1);
			assertEquals(expected2,actual2);
			assertEquals(expected3,actual3);
	}
	

}

