import java.io.*;

public class Ex15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			String[] ss = s.split(" ");
			int a = Integer.valueOf(ss[0]);
			int b = Integer.valueOf(ss[1]);
			bw.write(a + b + "\n");
		}
		bw.flush();
		bw.close();

	}
}