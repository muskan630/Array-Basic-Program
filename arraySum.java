import java.util.Scanner;
public class arraySum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to array Sum Calculator " );
		System.out.print("Please enter size of array : ");
		int size = input.nextInt();
		int[] arry = new int[size];
		
		int index=0;
		while(index<size) {
			System.out.print("enter element number " +(index+1) +": ");
			arry[index] = input.nextInt();
			index++;
		}
		long sum = sum(size, arry);
		System.out.println("Sum of the number is " +sum);
		double average = average(size, arry);
		System.out.println("Average of the number is " +average );
	}
	
	public static long sum(int size,int[] arry) {
		int i=0;
		long sum =0;
		while(i<arry.length) {
			sum+=arry[i];	
			i++;
		}
		return sum;
	}
	public static double average(int size ,int[] arry) {
		double sum = sum(size, arry);
		return (sum/arry.length);
	}
}
