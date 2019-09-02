
public class FlippingImage {
	public static int[][] flipAndInvertImage(int[][] A) {
		int C=A[0].length;
		for (int i=0;i<A.length;i++) {
			for (int j=0;j<(C+1)/2;j++) {
				int temp=A[i][j]^1;
				A[i][j]=A[i][C-1-j]^1;
				A[i][C-1-j]=temp;
				
			}
		}
		return A;
	}
	

	public static void main(String[] args) {
		int [][]input= {{1,1,0},{1,0,1},{0,1,1}};
		int [][] output=flipAndInvertImage(input);
		for (int i=0;i<output.length;i++) {
			for (int j=0;j<output[i].length;j++) {
				System.out.print(output[i][j]);
				
			}
			System.out.print("\n");
		}

	}

}
