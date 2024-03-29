import java.util.regex.Pattern;

public class StringCalculator {
	private String delimiter;
	private String inputs;
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
	String [] arr = inputs.split((delimiter));
	for(String each:arr) {
		int each_pasered=Integer.parseInt(each.trim());
		if(each_pasered>1000) {
			continue;}
		ensureNoNegativeNumbers(each_pasered);
	sum+=each_pasered;}
	return sum;}

private void ensureNoNegativeNumbers(int each_pasred) {
	if(each_pasred<0) {
	throw new IllegalArgumentException("Negatives not allowed: " +inputs);
	}
}
private static StringCalculator parser(String input) {
	if (input.startsWith("//")) {
		StringBuffer buff = new StringBuffer("");
		String [] vals = input.split("\n",2);
		buff.append("[");
		buff.append(vals[0].substring(2));
		buff.append("]+");
		return new StringCalculator(buff.toString(),vals[1]); }
	else   return new StringCalculator(",",input); 
}
}
