import java.util.*;
public class MergeTwoSortedArray {
	public static void main(String[] args) {
		System.out.println("Welcome to Merging Sorted Arrays");
		int[] arr1 =inputExtend.inputArray();
		Arrays.sort(arr1);
		System.out.println("Your first sorted array is " +Arrays.toString(arr1));
		int[] arr2 = inputExtend.inputArray();
		Arrays.sort(arr2);
		System.out.println("Your second sorted array is " +Arrays.toString(arr2));
		int[] MergeSortedArray = mergeBoth(arr1, arr2);
		Arrays.sort(MergeSortedArray);
		System.out.println("Your sorted array is merged " + Arrays.toString(MergeSortedArray));
	}
	public static int[] mergeBoth(int[] arr1 ,int[] arr2){
		int[] new_arr = new int[arr1.length + arr2.length];
		int i=0 , j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i]<=arr2[j]) {
				new_arr[k] = arr1[i];
				i++;
				k++;
			} else {
				new_arr[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			new_arr[k] = arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length) {
			new_arr[k] =arr2[j];
			k++;
			j++;
		}
	 return new_arr;
	}
}

