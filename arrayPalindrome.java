import java.util.Arrays;
public class arrayPalindrome {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to array palindrome checker ");
		int[] arr = inputExtend.inputArray();
		boolean palindrome =palindrome(arr);
		if (!palindrome) {
			System.out.println("Your " +Arrays.toString(arr) +" array is not palindrome ");
		} else {
			System.out.println("Your " +Arrays.toString(arr) +" is palindrome");
		}
	}
	public static boolean palindrome(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[(arr.length-1)-i]) {
				return true;
			} 
		}
	return false;
	}
}
