import java.util.regex.Pattern;

public class StringCalculator {
public static int add(String input) {
	int sum=0;
	if(input.isEmpty()) {
	return 0;
	}
	String delimiter= ",";
	if (input.startsWith("//")) {
		String [] vals = input.split("\n",2);
		delimiter = vals[0].substring(2);
		input = vals[1];
		
	}
		String [] arr = input.split(Pattern.quote(delimiter));
		
		for(String each:arr) {
			System.out.println(each);
			sum+=Integer.parseInt(each.trim());
	}
	return sum;
}

}
