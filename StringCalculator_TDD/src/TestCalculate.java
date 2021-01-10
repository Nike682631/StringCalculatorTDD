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
		assertEquals(calculator.calculate(""),0);
		
	}
	
	public void singleValueIsReplied() {
		assertEquals("1",1);
		
	}

}
