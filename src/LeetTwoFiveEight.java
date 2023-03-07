
public class LeetTwoFiveEight {
	
	// call a method to add the digits 
	// check if the digits is less than 10
	
	public static void main(String args[]) {
		
		int num = 67858;
		int sum = num;
		
		while (sum >= 10) {
			sum = addDig(sum);
			
		}
		System.out.println("Your sum is: " + sum);
		
	}
	
	public static int addDig(int num) {
		int sum = 0;
		
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		
		System.out.println(sum);
		return sum;
		
	}
	
}
