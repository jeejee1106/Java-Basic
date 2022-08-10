package codingtest;
import java.util.ArrayList;
import java.util.Arrays;

class Ess2_MinimunNumber {
	public int solution(int[] numArr) {
		int result = 0;
		int[] exampleArr = {0,1,2,3,4,5,6,7,8,9}; //파라미터로 받은 배열과 비교할 배열 생성
		ArrayList<Integer> list = new ArrayList<>(); //중복되는 데이터가 몇개인지 모르기 때문에 ArrayList로 배열 생성

		// 1. list에 없는 데이터일 경우 list에 담아주기(중복 제거)
		for(int numCheck : numArr) {
			if(!list.contains(numCheck)) { 
				list.add(numCheck); 
			}
		}
		
		// 2. (중복을 제거한)list에 담긴 데이터를 다시 int배열에 담아주기
		int[] newNumArr = new int[list.size()]; 
		for(int i = 0; i < newNumArr.length; i++ ) {
			newNumArr[i] = list.get(i);
		}

		// 3. 오름차순 정렬
		Arrays.sort(newNumArr); 
		
		// 4. newNum배열과 example배열을 비교해서 같지 않으면 없는숫자.
		// 정렬된 배열끼리의 비교이기 때문에 같지 않은 데이터가 나왔을 때가 제일 작은 숫자이다.
		for(int i = 0; i<newNumArr.length; i++) {
			if(newNumArr[i]!=exampleArr[i]) {
				return exampleArr[i];
			}
			result = exampleArr[i]+1; //제일 작은 숫자가 끝에 있을 경우 +1을 해서 그 다음 숫자 출력
		}
		
		return result;
	}
}