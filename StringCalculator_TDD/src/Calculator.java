
public class Calculator {
	
	private final String delimiter=",|\n";
	
	public int add(String input) throws Exception {
		
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
		findNegativeInputs(num);
		return findsum(num);

	}
	
	private int findsum(String[] num) {
		int sum=0;
		for (String current:num) {
			if(stringToInt(current)>1000)
				continue;
			sum+=Integer.parseInt(current);
		}
		return sum;
	}
	
	private void findNegativeInputs(String []num) throws Exception {
		String neg="";
		for (String current :num) {
			if(stringToInt(current)<0) {
				neg+=current+",";
				if(neg.length()==2) {
					throw new Exception("negatives not allowed"+neg.charAt(0) );
				}
				else {
					throw new Exception("negatives not allowed"+neg );
				}
			}
		}	
	}
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	 
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
