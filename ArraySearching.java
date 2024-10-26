import java.util.Scanner;
public class ArraySearching {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Searching : ");
		int[] arr = inputExtend.inputArray();
		System.out.print("Enter a number :");
		int num = input.nextInt();
		boolean isfound = isFound(arr,num);
		
		if(isfound) {
			System.out.println("Your number is found in the array ");
		}
		else {
			System.out.println("Your number is not found in the array");
		}
		
	}
	public static boolean isFound(int[] arr , int num) {
		int index = 0;
		while(index < arr.length) {
			if (arr[index] == num) {
				return true;
			}
			index++;
		}
		return false;
	}
}
