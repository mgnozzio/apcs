
public class ArrayExample {
	
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);
		int cols = Integer.parseInt(args[1]);
		
		int[][] board = new int[rows][cols];
		for(int r=0; r<board.length; r++) {
			int[] row = board[r];
			for(int c=0; c<row.length; c++) {
				row[c] = row[(c+r)%row.length]+r;
			}
		}
		for(int[] row : board) {
			for(int c : row) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
