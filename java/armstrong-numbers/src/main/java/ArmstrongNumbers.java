import java.util.ArrayList;
import java.util.List;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int length = String.valueOf(numberToCheck).length();

		List<Integer> digits = new ArrayList<>();
		int buffer = numberToCheck;
		while (digits.size() < length) {
			digits.add(buffer % 10);
			buffer = buffer / 10;
		}

		Double armstrongSum = digits.stream().map(digit -> Math.pow(digit, length)).reduce(0d, Double::sum);

		return (numberToCheck == armstrongSum);
	}

}
