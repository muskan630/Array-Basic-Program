import java.util.Scanner;
import java.util.Arrays;
public class numOfOccurence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array Occurences ");
		int[] arr = inputExtend.inputArray();
		System.out.print("Now enter a number you want to search occurrence in array " +Arrays.toString(arr) +" : ");
		int num = input.nextInt();
		int occurrence = occurrence(num, arr);
		System.out.println("The number "  +num +" occurs " +occurrence +" times ");
		System.out.println("Thank You ! ");
	}

	
	public static int occurrence(int num , int[] arr) {
		int index =0;
		int count =0;
		while(index<arr.length) {
			if (arr[index]==num) {
				count+=1;
			}
		index++;
		}
	return count;
	}
	
}
