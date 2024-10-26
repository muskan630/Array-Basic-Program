import java.util.*;
public class deletionArrayElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Array element deletion program ");
		int[] arr = inputExtend.inputArray();
		System.out.println(" ");
		System.out.print("Array Before deletion is : ");
		System.out.println(Arrays.toString(arr));
		System.out.println(" ");
		System.out.print("Please enter a number that you want to delete in the array - ");
		int delete_num = input.nextInt();
		boolean found = replaceElement(arr, delete_num);
		if (found==false) {
			System.out.println("Your number " +delete_num +" is not found in array");
		} else {
			System.out.println("Your number " +delete_num +" is deleted ");
			System.out.println(" ");
			System.out.print("After deletion Updated array is : ");
			System.out.println(Arrays.toString(arr));
			System.out.println(" ");
		}
	}
    
	public static boolean replaceElement(int[] arr,int num) {
		Scanner input =new Scanner(System.in);
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				System.out.print("Enter a number that you want to replace deleted element - ");
				int replace_num = input.nextInt();
				arr[i]= replace_num;
			    found= true;
			}
		}
		return found;
	}
	
}
