import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class StringCalculatorTest {
@Test
public void addEmptyStrings() {
	assertEquals(StringCalculator.add(""),0);
}
@Test
public void addTwoNumbersSeperatedbyCommas() {
	assertEquals(StringCalculator.add("1,2,5"),8);
	assertEquals(StringCalculator.add("1,3,5"),9);
}
@Test
public void addNumbersDelimitedByNewLine() {
	assertEquals(StringCalculator.add("1\n,2,3"),6);
}
@Test
public void addDemiliterSpecifiedAtStart() {
	
}
}
