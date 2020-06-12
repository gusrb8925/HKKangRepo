
public class ExMethod {

	public static void main(String[] args) {
		System.out.println("main함수 호출 시작!!");
		int res = sum(1, 2);
		System.out.println("sum함수 실행 결과 :" + res);
		System.out.println("main함수 호출끝");
	}

	public static int sum(int i1, int i2) {
		System.out.println("sum함수 호출시작!!");
		int sum = 0;
		for (int i = 11; i <= 12; i++) {
			sum += 1;
		}
		System.out.println("sum함수 호출 끝!!");
		return sum;

	}

}
