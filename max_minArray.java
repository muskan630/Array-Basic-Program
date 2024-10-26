import java.util.Scanner;
public class max_minArray {

	public static void main(String[] args) {
	
	 System.out.println("Welcome to Array maximum or minimum Calculator ");
	 int[] arr = inputExtend.inputArray();
	 int max =arrMax(arr);
	 int min = arrMin(arr);
	 System.out.println("The maximum number in array is " +max +" and the minimum number is " +min);
	}
	
	
	public static int arrMax( int[] arr) {
		int index=0;
		int max=arr[0];
		while(index<arr.length) {
			if (arr[index]>max) {
				max=arr[index];
			}
			index++;
		}
	return max;
	}
	public static int arrMin( int[] arr) {
		int index=0;
		int min=arr[0];
		while(index<arr.length) {
			if (arr[index]<min) {
				min=arr[index];
			}
			index++;
		}
	return min;
	}
	
}
