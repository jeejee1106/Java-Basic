package codingtest;
import java.util.Arrays;

class Opt2_MiddleNumber {
	public int solution(int[] numArr) {
		// 1. 파라미터로 받은 배열을 복사한 배열 생성
		Integer[] newNumArr = {numArr[0], numArr[1], numArr[2]};
		
		// 2. 파라미터로 받은 배열을 정렬한 후 중간 값 추출
		Arrays.sort(numArr);
		int middle = numArr[1];
		
		// 3. numArr배열의 중간값에 해당하는 인덱스 번호 찾기
		int result = Arrays.asList(newNumArr).indexOf(middle);
		
		return result;
	}
}