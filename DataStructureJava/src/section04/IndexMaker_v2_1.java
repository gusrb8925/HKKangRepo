package section04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//인프런 Java로 배우는 자료구조 권오흠교수님
//제2-1장: 클래스, 객체, 참조변수 3
public class IndexMaker_v2_1 {

	// static String[] words = new String[100000];
	// static int[] count = new int[100000];

	static Item[] items = new Item[100000];
	static int n = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("$ ");
			String command = sc.next();

			if (command.equals("read")) {
				String fileName = sc.next();
				makeIndex(fileName);

			} else if (command.equals("find")) {
				String str = sc.next();
				int index = findWord(str);
				if (index > -1) {
					System.out.println("The word " + items[index].word + " appears " + items[index].count + " times");
				} else {
					System.out.println("The word " + str + " not appears ");
				}

			} else if (command.equals("saveas")) {
				String fileName = sc.next();
				saveAs(fileName);

			} else if (command.equals("exit")) {
				break;

			}

		}
		sc.close();

	}

	static void saveAs(String fileName) {
		try {
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
			for (int i = 0; i < n; i++) {
				outFile.println(items[i].word + " " + items[i].count);
			}

			outFile.close();
		} catch (IOException e) {
			System.out.println("Save failed");
			return;
		}

	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while (inFile.hasNext()) {
				String str = inFile.next();

				String trimmed = triming(str);// 코드23 수정사항
				if (trimmed != null) {
					addWord(trimmed.toLowerCase());
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;
		}
	}

	static String triming(String str) {// 코드23 수정사항
		int i = 0, j = str.length() - 1;
		while (i < str.length() && !Character.isLetter(str.charAt(i))) {
			i++;
		}
		while (j >= 0 && !Character.isLetter(str.charAt(j))) {
			j--;
		}
		if (i > j) {
			return null;
		}

		return str.substring(i, j + 1);
	}

	static void addWord(String str) {
		int index = findWord(str); // -1 리턴은 못찾는것
		if (index != -1) {
			items[index].count++;
		} else { // 코드23 수정사항 ordered list insert
			int i = n - 1;
			while (i >= 0 && items[i].word.compareToIgnoreCase(str) > 0) {
				items[i + 1] = items[i];
				i--;
			}
			items[i + 1] = new Item();
			items[i + 1].word = str;
			items[i + 1].count = 1;
			n++;
		}
	}

	static int findWord(String str) {
		for (int i = 0; i < n; i++) {
			if (items[i].word.equalsIgnoreCase(str)) {
				return i;
			}
		}
		return -1;
	}

}
