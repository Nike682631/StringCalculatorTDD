import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public class TestCalculate {
	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator=new Calculator();
	}
	
	//First Test Case
	public void emptyStringReturnsZero() throws Exception {						
		assertEquals(calculator.add(""), 0);
		
	}
	
	//Second Test Case
	public void singleValueIsReplied() throws Exception {
		assertEquals(calculator.add("1"), 1);
		
	}
	
	//Third Test Case
	public void twoNumbersCommaDelimitersReturnSum() throws Exception {
		assertEquals(calculator.add("1,2"),3);
	}
	
	//Fourth Test Case
	public void twoNumbersNewLineDelimitersReturnSum() throws Exception {
		assertEquals(calculator.add("1\n2"),3);
	}
	
	//Fifth Test Case
	public void threeNumbersCommaDelimitersBothWaysReturnSum() throws Exception {
		assertEquals(calculator.add("1,2,3"),6);
	}
	
	//Sixth Test case
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() throws Exception {
		calculator.add("-1");
		calculator.add("-1,23,-4,-5");
	}
	
	//Seventh Test case
	public void IgnoreNumberGreaterthan1000() throws Exception {
		assertEquals(calculator.add("1001,10,10"),20);

	}
//	
//	//Eighth Test Case
//	public void DelimitersofAnyLength() throws Exception {
//		assertEquals(calculator.add("//[***]\n1***2***3"),(6));
//	}
//	
	//Ninth Test Case
	public void AcceptsMultipleDelimiters() throws Exception {
		assertEquals(calculator.add("//[**][%%]\n1**2%%3"),6);
	}
	
	
}
