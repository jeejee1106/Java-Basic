package codingtest;
class Ess4_FruitCode {
	int sum; //자릿수의 총 합
	int newNum; //num - sum 값을 저장할 변수
	public String solution(int num) {
		newNum = num;
		if(100 <= num && num <= 10000) {
			while(newNum >= 100) { //자릿수의 총 합을 뺀 값이 100이하가 될 때까지 반복
				checkDate(num);
			}
		}else if(10 <= num && num < 100) {
			checkDate(num);
		}else {
			return "10~10000사이의 값을 입력해주세요.";
		}
		//System.out.println(n + ":" + sum + ":" + m);
		switch(newNum % 9) {
		case 0: return "apple";
		default: return "그 외 값은 나올 수 없습니다.";
		}
	}
	
	//파라미터로 받은 값의 자릿수 총합을 빼줄 메서드
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