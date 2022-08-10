package codingtest;
class Ess3_WinningPoint {
	public int solution(String[] scoreArr) {
		int point = 0;
		
		// 1. 파라미터로 받은 배열을 분리해서 한 경기당 나의팀과 상대팀의 점수 비교하기
		for(String scoreCheck : scoreArr) {
			String[] scoreSplit = scoreCheck.split(":");
			
			// 2. 문자열로 분리된 점수를 형변환 해주기
			int myPoint = Integer.parseInt(scoreSplit[0]);
			int otherPoint = Integer.parseInt(scoreSplit[1]);
			
			if(myPoint > otherPoint) {
				point += 4;
			} else if(myPoint == otherPoint){
				point += 1;
			} else {
				point += 0;
			}
		}
		
		return point;
	}
}