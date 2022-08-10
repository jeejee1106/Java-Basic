package codingtest;
import java.util.Arrays;

class Opt2_MiddleNumber {
	public int solution(int[] numArr) {
		// 1. �Ķ���ͷ� ���� �迭�� ������ �迭 ����
		Integer[] newNumArr = {numArr[0], numArr[1], numArr[2]};
		
		// 2. �Ķ���ͷ� ���� �迭�� ������ �� �߰� �� ����
		Arrays.sort(numArr);
		int middle = numArr[1];
		
		// 3. numArr�迭�� �߰����� �ش��ϴ� �ε��� ��ȣ ã��
		int result = Arrays.asList(newNumArr).indexOf(middle);
		
		return result;
	}
}