import java.util.*;


public class printEven_continueOdd {

	public static void main(String[] args) {
		System.out.println("Welcome to print even element and ignore the odd element");
		int[] arr = inputExtend.inputArray();
		System.out.println("Your array is : " +Arrays.toString(arr));
		even_num(arr);
	}
	public static void even_num(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] %2 ==0) {
				System.out.println("Even elements in entered array is: "+arr[i]);
			} else {
				continue;
			}
		}
	}
}
