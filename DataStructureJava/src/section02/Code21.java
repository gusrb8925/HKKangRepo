package section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제1-2장: 메서드 호출과 프로그램의 기능적 분할4
//
public class Code21 {
	static int n;
	static int[][] grid;

	public static void main(String[] args) {
		try {
			Scanner inFile = new Scanner(new File("data.txt"));
			n = inFile.nextInt();
			grid = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					grid[i][j] = inFile.nextInt();
				}
			}
			inFile.close();

			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					for (int dir = 0; dir < 8; dir++) {
						for (int len = 1; len <= n; len++) {
							int val = computeValue(x, y, dir, len);
							if (val != -1 && isPrime(val)) {
								System.out.println(val);
							}
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Not found file");
		}
	}

	private static boolean isPrime(int val) {
		if (val < 2) {
			return false;
		}
		for (int i = 2; i * i <= val; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int computeValue(int x, int y, int dir, int len) {
		int val = 0;
		for (int i = 0; i < len; i++) {
			int digit = getDigit(x, y, dir, i);
			if (digit == -1) {
				return -1;
			}
			val = val * 10 + digit;
		}
		return val;
	}

	static int[] offsetX = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int[] offsetY = { -1, -1, 0, 1, 1, 1, 0, -1 };

	public static int getDigit(int x, int y, int dir, int k) {
		int newX = x + k * offsetX[dir];
		int newY = y + k * offsetY[dir];
		if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length) {
			return -1;
		} else {
			return grid[newX][newY];
		}
	}

}
