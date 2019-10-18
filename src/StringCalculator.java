import java.util.regex.Pattern;

public class StringCalculator {
	private String delimiter;
	private String inputs;
	String x=null;
	private StringCalculator (String delimiter, String inputs) {
		this.delimiter=delimiter;
		this.inputs=inputs;
	}
public static int add(String input) {
	
	if(input.isEmpty()) {
	return 0;
	}
	StringCalculator cal =parser(input);
	return cal.summer();
}
private int summer() {
	int sum=0;
	String [] arr = inputs.split(Pattern.quote(delimiter));
	for(String each:arr) {
		int each_pasered=Integer.parseInt(each.trim());
		ensureNoNegativeNumbers(each_pasered);
	sum+=each_pasered;
}
	return sum;
}
private void ensureNoNegativeNumbers(int each_pasred) {
	if(each_pasred<0) {
	throw new IllegalArgumentException("Negatives not allowed: " +inputs);
	}
}
private static StringCalculator parser(String input) {
	if (input.startsWith("//")) {
		String [] vals = input.split("\n",2);
		return new StringCalculator( vals[0].substring(2),vals[1]);
	}
	else {
		return new StringCalculator(",",input);
	}
}
}
