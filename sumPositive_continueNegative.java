import java.util.*;
import java.util.Arrays;
public class sumPositive_continueNegative {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Enter a size of an array : ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i =0; i<arr.length; i++) {
			System.out.print("Please, Enter element number " + (i+1) +":  ");
			arr[i]= input.nextInt();
		}
	   System.out.println("Your array is" +Arrays.toString(arr)+ " and sum is: " +sum(arr));
	   
	}
	public static int sum(int[] arr ) {
		int sum=0;
		for (int i : arr) {
			if (i<0) {
				continue;
			} else {
				sum = sum+ i;
			}
		}
		return sum;
	}

}
