package codingtest;
import java.util.ArrayList;
import java.util.Arrays;

class Opt4_IQ_Test {
	public int solution(int[] numArr) {
		int evenCount = 0; //짝수 갯수
		int oddCount = 0; //홀수 갯수
		
		ArrayList<String> list = new ArrayList<>();
		
		// 1. 파라미터로 받은 배열의 데이터가 짝수면 list에 even, 홀수면 odd 담기
		for(int numCheck : numArr) {
			if(numCheck % 2 == 0) {
				list.add("even");
			}else {
				list.add("odd");
			}
		}
		
		// 2. list에 담긴 데이터를 String배열에 담기
		String[] check = new String[list.size()];
		for(int i = 0; i<check.length; i++) {
			check[i] = list.get(i);
			// 3. 홀, 짝 여부에 따라 count에 1씩 더해주기
			if(check[i].equals("even")) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		// 4. 하나만 존재하는 값의 순번 출력
		if(evenCount==1) {
			return Arrays.asList(check).indexOf("even") + 1;
		} else {
			return Arrays.asList(check).indexOf("odd") + 1;
		}
	}
}