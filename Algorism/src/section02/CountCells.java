package section02;

//인프런 영리한 프로그래밍을 위한 알고리즘 강좌 권오흠 교수님
//순환(Recursion) 의 응용: Counting Cells in a Blob
public class CountCells {

	private static int BACKGROUND = 0;
	private static int IMAGE = 1;
	private static int ALREADY = 2;
	private static int N = 8;
	private static int[][] grid = new int[N][N];

	public static void main(String[] args) {

	}

	public int countCells(int x, int y) {
		if (x < 0 || x >= N || y < 0 || y >= N) {
			return 0;
		} else if (grid[x][y] != IMAGE) {
			return 0;
		} else {
			grid[x][y] = ALREADY;
			return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1) + countCells(x + 1, y + 1) + countCells(x - 1, y)
					+ countCells(x + 1, y) + countCells(x - 1, y - 1) + countCells(x, y - 1) + countCells(x + 1, y - 1);
		}
	}

}
