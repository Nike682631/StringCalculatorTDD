
public class Calculator {
	
	private final String delimiter=",|\n";
	
	public int calculate(String input) {
		
		String num[]=input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1) {
			return stringToInt(input);
		}
		else {
			return getSum(num);
		}
		
	}
	
	private int getSum(String[]num) {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum+=Integer.parseInt(num[i]);
		}
		return sum;

	}
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	 
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
