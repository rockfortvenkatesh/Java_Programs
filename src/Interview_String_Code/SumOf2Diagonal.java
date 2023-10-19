package Interview_Integer_Code;

public class SumOf2Diagonal {

	public static void main(String[] args) {
		int[][] diagonal = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 8, 7, 6 } };
		int n = diagonal.length;

		int firstDiagonal = 0;
		int secondDiagonal = 0;

		for (int i = 0; i < diagonal.length; i++) {
			firstDiagonal += diagonal[i][i];
		}
		for (int i = 0; i < diagonal.length; i++) {
			secondDiagonal += diagonal[i][n - 1 - i];
		}

		System.out.println("first sum of diagonal is :" + firstDiagonal);
		System.out.println("second sum of diagonal is :" + secondDiagonal);
	}

}
