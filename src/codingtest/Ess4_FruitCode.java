package codingtest;
class Ess4_FruitCode {
	int sum; //�ڸ����� �� ��
	int newNum; //num - sum ���� ������ ����
	public String solution(int num) {
		newNum = num;
		if(100 <= num && num <= 10000) {
			while(newNum >= 100) { //�ڸ����� �� ���� �� ���� 100���ϰ� �� ������ �ݺ�
				checkDate(num);
			}
		}else if(10 <= num && num < 100) {
			checkDate(num);
		}else {
			return "10~10000������ ���� �Է����ּ���.";
		}
		//System.out.println(n + ":" + sum + ":" + m);
		switch(newNum % 9) {
		case 0: return "apple";
		default: return "�� �� ���� ���� �� �����ϴ�.";
		}
	}
	
	//�Ķ���ͷ� ���� ���� �ڸ��� ������ ���� �޼���
	public void checkDate(int num) {
		num = newNum;
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		newNum -= sum;
		sum = 0;
	}
}