package Array;

public class d2arrTraversal {

	public static void main(String[] args) {
		int[][] d2arr = {{2,4,3},{3,5},{5,6,0}};
		
		// traversal //
		
		int i = 0;
		while(i<d2arr.length) {
			int j=0;
			while(j<d2arr[i].length) {
				System.out.print(d2arr[i][j]+ " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
