import java.io.*;

public class Ex1284 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		while (N != 0) {
			int ans = 1;
			while (N != 0) {
				int a = N % 10;
				if (a == 0) {
					ans += 4;
				} else if (a == 1) {
					ans += 2;
				} else {
					ans += 3;
				}
				ans++;
				N /= 10;
			}
			bw.write(ans + "\n");
			N = Integer.parseInt(br.readLine());
		}

		bw.flush();
		br.close();
		bw.close();
	}
}