public class IsSorted_array {

	public static void main(String[] args) {
		System.out.println("Welcome to array sorting check post ");
		  int[] arr = inputExtend.inputArray();
		  boolean isIncrease = isIncreasing(arr);
		  boolean isDecrease =isDecreasing(arr);
		  if (isDecrease || isIncrease) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array is not sorted ");
		}
	}

	public static boolean isIncreasing(int[] arr) {
		int i=1;
		while(i<arr.length) {
			if (arr[i]<=arr[i-1]) {
				return false;
			}
		i++;
		}
		return true;
	}
	public static boolean isDecreasing(int[] arr) {
		int i=1;
		while(i<arr.length) {
			if (arr[i]>=arr[i-1]) {
				return false;
			}
		i++;
		}
		return true;
	}
}
