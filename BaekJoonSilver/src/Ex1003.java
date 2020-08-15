import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
		int[] nArray = new int[t];

		for (int i = 0; i < t; i++) {
			nArray[i] = Integer.parseInt(br.readLine());
		}

		int[] zeroCount = new int[41];
		int[] oneCount = new int[41];

		zeroCount[0] = 1;
		oneCount[0] = 0;
		zeroCount[1] = 0;
		oneCount[1] = 1;

		for (int j = 2; j < 41; j++) {
			zeroCount[j] = zeroCount[j - 1] + zeroCount[j - 2];
			oneCount[j] = oneCount[j - 1] + oneCount[j - 2];
		}

		for (int k = 0; k < nArray.length; k++) {
			System.out.println(zeroCount[nArray[k]] + " " + oneCount[nArray[k]]);
		}

	}
}
