import java.util.ArrayList;
import java.util.List;

public class PalNumbers {

	public static void main(String[] args) {
		
		int highestPalNumber;
		
		highestPalNumber = getPal();
		
		System.out.println("The highest Palindrome in this range is " + highestPalNumber);

	}
	
	public static int getPal() {
		int palTotal = 0;
		int lowest = 10000;
		int highest = 998001;
		List <Integer> list = new ArrayList<Integer>();
		
		
		
		for(int i=lowest; i <= highest; i++) {
			
			String s = String.valueOf(i);
			int length = s.length();
			//System.out.println(length);
			
			if(length == 5) {
				if(s.charAt(1) == s.charAt(3) && s.charAt(0) == s.charAt(4)) {
					list.add(i);
					System.out.println(i + " is a palindrome!");
					
				}
				else;
				
			}
			
			if(length == 6) {
				if(s.charAt(2) == s.charAt(3) && s.charAt(1) == s.charAt(4) && s.charAt(0) == s.charAt(5)) {
					list.add(i);
					System.out.println(i + " is a palindrome!");
					
				}
				else;
				
			}
			

			
			
		}
		
		//E e = list.get(list.size() - 1);
		palTotal = list.get(list.size() -1);
		
		
		
		
		return palTotal;
		
	}
	
	//NEED TO CREATE A FUNCTION THAT MULTIPLIES ALL NUMBERS BETWEEN 100 - 999
	//AGAINST EACHOTHER, AND RETURNS AN ARRAY OF THOSE PRODUCTS
	
	//One example, we can put the range of 100 - 999 in an array, then multiply 100 - 999 against it
	//will need to find a way to iterate 100*array, then store those products in a separate array
	//once 100 is done multiplying, go on to 101, but make sure 101 doesn't multiply into 100 again
	//so on and so forth until the end.
	

}
