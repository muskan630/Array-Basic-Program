import java.util.Arrays;

public class IsSorted_array {

	public static void main(String[] args) {
		System.out.println("Welcome to array sorting check post ");
		  int[] arr = inputExtend.inputArray();
		  System.out.println("Your entered array is: " +Arrays.toString(arr));
			boolean is_increase = isIncreasing(arr);
			boolean is_decrease = isDecreasing(arr);
			System.out.println("Your array is " +(is_increase||is_decrease ? "Sorted " : "not sorted "));
		}


	public static boolean isIncreasing(int[] arr) {
		for(int i= 1; i<arr.length ; i++) {
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}
	public static boolean isDecreasing(int[] arr) {
		for(int i= 1; i<arr.length ; i++) {
			if(arr[i]>arr[i-1]) return false;
		}
		return true;
	}
}
