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
	public void emptyStringReturnsZero() {						
		assertEquals(calculator.calculate(""), 0);
		
	}
	
	//Second Test Case
	public void singleValueIsReplied() {
		assertEquals(calculator.calculate("1"), 1);
		
	}
	
	//Third Test Case
	public void twoNumbersCommaDelimitersReturnSum() {
		assertEquals(calculator.calculate("1,2"),3);
	}
	
	//Fourth Test Case
	public void twoNumbersNewLineDelimitersReturnSum() {
		assertEquals(calculator.calculate("1\n2"),3);
	}
	
	//Fifth Test Case
	public void threeNumbersCommaDelimitersBothWaysReturnSum() {
		assertEquals(calculator.calculate("1,2,3"),6);
	}
	
	//Sixth Test case
	@Test(expectedExceptions=Exception.class)
	public void negativeInputReturnsException() {
		calculator.calculate("-1");
	}
}
