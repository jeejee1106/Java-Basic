package codingtest;
class Opt1_Vowel {
	public int solution(String str) {
		int count = 0;
		String[] vowel = {"a", "e", "i", "o", "u"}; //모음 배열 생성
		String[] strArr = str.split(""); //파라미터로 받은 문자열을 분리해서 배열에 넣기

		// 1. 두 배열을 비교해서 같은 데이터가 있으면 count에 1씩 더해준다.
		for(String checkStr : strArr) {
			for(String checkVowel : vowel) {
				if(checkStr.equals(checkVowel)) {
					count++;
				}
			}
		}
		
		return count;
	}
}