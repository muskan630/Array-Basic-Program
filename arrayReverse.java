import java.util.Arrays;
public class arrayReverse {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to Array Reversal ");
		int[] arr = inputExtend.inputArray();
		System.out.println();
		System.out.print("Your array is -  " );
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr);
		System.out.print("Your reversed array is : " );
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
	public static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
		    int swap = arr[i] ;
			arr[i] = arr[(arr.length-1)-i];
			arr[(arr.length-1)-i]=swap;
		}
		
	}
}
