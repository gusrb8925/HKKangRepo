import java.util.*;

public class Dislike2 {
	public static int[] solution(int []arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a =10;
		for (int i : arr) {
			if(a != i) {
				al.add(i);
				a =i;
			}
		}
		int[] answer = new int[al.size()];
		for(int j =0; j<answer.length;j++) {
			answer[j] = al.get(j);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		System.out.println(Arrays.toString(solution(arr1)));
		System.out.println(Arrays.toString(solution(arr2)));
	}

}
