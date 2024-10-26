import java.util.Scanner;
public class inputExtend {

	public static int[] inputArray() {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a size of array : ");
		 int size = input.nextInt();
		 int[] arr = new int[size];
		 int index =0;
		 while(index<arr.length) {
			 System.out.print("enter element number " +(index+1) +": ");
			 arr[index] =input.nextInt();
			 index++;
	}
		 return arr;
	}

	 public static int[][] input2dArray() {
		 Scanner input = new Scanner(System.in)                                  ;
		 System.out.print("Enter size of rows : ");
		 int rows = input.nextInt();
		 System.out.print("Enter size of columns : ");
		 int columns = input.nextInt();
		 int[][] arr = new int[rows][columns];
		 
		 int i =0;
		 while(i<rows) {
			int j=0;
			while(j<columns) {
				 System.out.print("enter element row " +(i+1) +" , column" +(j+1)  +" : ");
				 arr[i][j] =input.nextInt();
				 j++;                                                    
			}
		  i++;
		 }
		 
	 return arr;
    }
}
