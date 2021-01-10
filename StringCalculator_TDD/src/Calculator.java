
public class Calculator {

	public int calculate(String input) {
		String num[]=input.split(",");
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1) {
			return stringToInt(input);
		}
		else {
			return Integer.parseInt(num[0])+ Integer.parseInt(num[1]);
		}
		
	}
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	 
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
