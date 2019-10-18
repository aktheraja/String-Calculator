
public class StringCalculator {
public static int add(String input) {
	int sum=0;
	if(input.isEmpty()) {
	return 0;
	}
	else if(input.contains(",")) {
		String [] arr = input.split(",");
		for(String each:arr) {
			sum+=Integer.parseInt(each);
		}
	}
	return sum;
	
}

}
