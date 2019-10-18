import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
	assertEquals(StringCalculator.add("1,2\n,3"),6);
}
@Test
public void addDemiliterSpecifiedAtStart() {
	assertEquals(StringCalculator.add("//;\n1;3;4"),8);
	assertEquals(StringCalculator.add("//$\n1$2$3"),6);
	assertEquals(StringCalculator.add("//@\n2@3@8"),13);


}
@Rule
public ExpectedException expected = ExpectedException.none();

@Test
public void throwsOnNegativeNumber() {
	expected.expect(IllegalArgumentException.class);
	expected.expectMessage("Negatives not allowed");
	StringCalculator.add("-32");
}
@Test
public void throwsOnNegativesWithAllNumbersNegative() {
	expected.expect(IllegalArgumentException.class);
	expected.expectMessage("Negatives not allowed: 1,-2,-5,23,-6");
	StringCalculator.add("1,-2,-5,23,-6");
}
@Test
public void NumbersLargerThan1000ShouldbeIgnored() {
	assertEquals(StringCalculator.add("2,1001"),2);
}
public void arbitraryLengthDelimiter() {
	assertEquals(StringCalculator.add("//***\n1***2***3"),6);
}
//public void acceptMultipleDelimters() {
//	assertEquals(StringCalculator.add("//$,@\n1$2@3"),6);
//}
}

