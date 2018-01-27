import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalNumbers {

	public static void main(String[] args) {

		int highestPalNumber;
		List<Integer> products;

		products = multiply();
		highestPalNumber = getPal(products);

		System.out.println("The highest Palindrome in this range is " + highestPalNumber);

	}

	public static int getPal(List<Integer> products) {
		int palTotal = 0;
		int prodElement;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= products.size()-1; i++) {
			prodElement = products.get(i);

			String s = String.valueOf(prodElement);
			int length = s.length();
			// System.out.println(length);

			if (length == 5) {
				if (s.charAt(1) == s.charAt(3) && s.charAt(0) == s.charAt(4)) {
					list.add(i);
					// System.out.println(i + " is a palindrome!");

				} else
					;

			}

			if (length == 6) {
				if (s.charAt(2) == s.charAt(3) && s.charAt(1) == s.charAt(4) && s.charAt(0) == s.charAt(5)) {
					list.add(i);
					// System.out.println(i + " is a palindrome!");

				} else
					;

			}

		}
		//here it's returning the index of this list, I will need to return the element
		//instead. Do the same thing as you did above with prodElement
		palTotal = list.size() - 1;

		return palTotal;

	}

	public static List<Integer> multiply() {
		List<Integer> products = new ArrayList<Integer>();
		List<Integer> range = new ArrayList<Integer>();

		for (int i = 100; i <= 999; i++) {

			range.add(i);

		}
		for (int i = 100; i <= 999; i++) {
			for (int x = range.get(0); x <= range.size(); x++) {
				products.add(i * x);

			}
		}

		// System.out.println(products);

		return products;

	}

}
