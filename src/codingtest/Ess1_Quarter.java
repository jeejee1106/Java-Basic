package codingtest;
class Ess1_Quarter {
	public int solution(int month) {
		
		if(1<=month && month<=12) { //month�� ������ 1~12
			switch(month) {
			case 1: case 2: case 3: return 1;
			case 4: case 5: case 6: return 2;
			case 7: case 8: case 9: return 3;
			default: return 4;
			}
		} else {
			return -1; //month�� ������ 1~12�� ����� -1 ��ȯ
		}
	}
}