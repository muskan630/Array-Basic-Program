import java.util.Scanner;
import java.util.Arrays;
public class numOfOccurence_ForEach {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to no. of occurrence of array element ");
		System.out.print("Enter size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i =0; i<arr.length; i++) {
			System.out.print("Enter element number " +(i+1) +": ");
			arr[i] = input.nextInt();
		}
		System.out.println("Your occurrence is " +occ(arr, input) +" times in array " +Arrays.toString(arr));
	}
	
	public static int occ(int[] arr, Scanner input) {
		int count=0;
		System.out.print("Enter a number that occurs no. of times:  ");
		int num = input.nextInt();
		for(int num1 : arr) {
			if (num1==num) {
				count+= 1;
			}
		}
		return count;
	}
}
