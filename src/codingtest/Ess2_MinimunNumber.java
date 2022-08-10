package codingtest;
import java.util.ArrayList;
import java.util.Arrays;

class Ess2_MinimunNumber {
	public int solution(int[] numArr) {
		int result = 0;
		int[] exampleArr = {0,1,2,3,4,5,6,7,8,9}; //�Ķ���ͷ� ���� �迭�� ���� �迭 ����
		ArrayList<Integer> list = new ArrayList<>(); //�ߺ��Ǵ� �����Ͱ� ����� �𸣱� ������ ArrayList�� �迭 ����

		// 1. list�� ���� �������� ��� list�� ����ֱ�(�ߺ� ����)
		for(int numCheck : numArr) {
			if(!list.contains(numCheck)) { 
				list.add(numCheck); 
			}
		}
		
		// 2. (�ߺ��� ������)list�� ��� �����͸� �ٽ� int�迭�� ����ֱ�
		int[] newNumArr = new int[list.size()]; 
		for(int i = 0; i < newNumArr.length; i++ ) {
			newNumArr[i] = list.get(i);
		}

		// 3. �������� ����
		Arrays.sort(newNumArr); 
		
		// 4. newNum�迭�� example�迭�� ���ؼ� ���� ������ ���¼���.
		// ���ĵ� �迭������ ���̱� ������ ���� ���� �����Ͱ� ������ ���� ���� ���� �����̴�.
		for(int i = 0; i<newNumArr.length; i++) {
			if(newNumArr[i]!=exampleArr[i]) {
				return exampleArr[i];
			}
			result = exampleArr[i]+1; //���� ���� ���ڰ� ���� ���� ��� +1�� �ؼ� �� ���� ���� ���
		}
		
		return result;
	}
}