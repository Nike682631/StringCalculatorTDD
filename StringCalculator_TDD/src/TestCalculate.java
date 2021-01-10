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
	
	public void emptyStringReturnsZero() {
		assertEquals(calculator.calculate(""), 0);
		
	}
	
	public void singleValueIsReplied() {
		assertEquals(calculator.calculate("1"), 1);
		
	}
	
	public void twoNumbersCommaDelimitersReturnSum() {
		assertEquals(calculator.calculate("1,2"),3);
	}

}
