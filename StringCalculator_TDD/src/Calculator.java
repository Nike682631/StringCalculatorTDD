
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Calculator {
	
	
	public int add(String input) throws Exception {
		String num[]=null;
		if(input.startsWith("//")) {
			String[] NumberandPattern=input.split("\n",2);
			String delimiter=parseDelimiter(NumberandPattern[0]);
			String num1[]= NumberandPattern[1].split(delimiter);
			//num=num1.clone();
		}
		
		else {
			String delimiter=",|\n";
			String num2[]=input.split(delimiter);
			num=num2.clone();
		}	
		
		
		
		
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
	
	private static String parseDelimiter(String header) {
		String delimiter = header.substring(2);
		if (delimiter.startsWith("[")) {
			delimiter = delimiter.substring(1, delimiter.length() - 1);
		}
		return Stream.of(delimiter.split("]\\["))
				.map(Pattern::quote)
				.collect(Collectors.joining("|"));
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	
	 
	private int stringToInt(String input) {
		return Integer.parseInt(input);
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
	
	
	

}
