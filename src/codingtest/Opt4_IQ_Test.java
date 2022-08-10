package codingtest;
import java.util.ArrayList;
import java.util.Arrays;

class Opt4_IQ_Test {
	public int solution(int[] numArr) {
		int evenCount = 0; //¦�� ����
		int oddCount = 0; //Ȧ�� ����
		
		ArrayList<String> list = new ArrayList<>();
		
		// 1. �Ķ���ͷ� ���� �迭�� �����Ͱ� ¦���� list�� even, Ȧ���� odd ���
		for(int numCheck : numArr) {
			if(numCheck % 2 == 0) {
				list.add("even");
			}else {
				list.add("odd");
			}
		}
		
		// 2. list�� ��� �����͸� String�迭�� ���
		String[] check = new String[list.size()];
		for(int i = 0; i<check.length; i++) {
			check[i] = list.get(i);
			// 3. Ȧ, ¦ ���ο� ���� count�� 1�� �����ֱ�
			if(check[i].equals("even")) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		// 4. �ϳ��� �����ϴ� ���� ���� ���
		if(evenCount==1) {
			return Arrays.asList(check).indexOf("even") + 1;
		} else {
			return Arrays.asList(check).indexOf("odd") + 1;
		}
	}
}