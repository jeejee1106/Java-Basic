package codingtest;
class Ess3_WinningPoint {
	public int solution(String[] scoreArr) {
		int point = 0;
		
		// 1. �Ķ���ͷ� ���� �迭�� �и��ؼ� �� ���� �������� ������� ���� ���ϱ�
		for(String scoreCheck : scoreArr) {
			String[] scoreSplit = scoreCheck.split(":");
			
			// 2. ���ڿ��� �и��� ������ ����ȯ ���ֱ�
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