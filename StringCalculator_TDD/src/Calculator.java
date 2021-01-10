
public class Calculator {
	
	private final String delimiter=",|\n";
	
	public int calculate(String input) throws Exception {
		
		String num[]=input.split(delimiter);
		if(isEmpty(input)) {
			return 0;
		}
		if(input.length()==1 && num.length==1) {
			return stringToInt(input);
		}
		else {
			return getSum(num);
		}
		
	}
	
	private int getSum(String[]num) throws Exception {
		for (String current :num) {
			if(stringToInt(current)<0) {
				throw new Exception("negatives not allowed"+ current);
			}
		}
		
		int sum=0;
		for (String current:num) {
			sum+=Integer.parseInt(current);
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
