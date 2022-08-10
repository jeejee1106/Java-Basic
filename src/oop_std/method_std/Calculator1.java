package oop_std.method_std;

class Cal1 { //Cal1 이라는 클래스가 있다

	//메서드를 생성해보자. 메서드는 메서드명 앞에 리턴타입을 적어줘야한다.
	//리턴 타입의 종류는 데이터타입(9개) + void 가 있다
	void powerOn() { //powerOn 메서드는 전원만 키면 돼서 리턴값이 필요없다.
		System.out.println("전원이 켜집니다.");	 //그래서 비어있다는 뜻의 리턴타입인 void를 줌!
	}

	int plus(int a, int b) { //plus 메서드는 값을 더하고 결과를 호출한 곳에 넘겨야해서 int타입의 리턴타입을 넣어줬다.
		int result = a+b;     //그래서 리턴될 result 변수도 int타입에 넣음
		return result;
	}

	double divide(int a, int b) { //divide 메서드는 값을 나누고 결과를 호출한 곳에 넘겨야해서
		double result = a/b;		//double 타입의 리턴타입을 줌.
		return result;
	}

	void powerOff() {
		System.out.println("전원이 꺼집니다.");
	}
}

public class Calculator1 {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1(); //Cal1클래스의 객체 생성
		
		c1.powerOn();//메서드 호출 (Cal1클래스인 인스턴스인 c1을 만들고, 메서드를 호출한 것)
		
		int result1 = c1.plus(10, 20); //plus메서드를 호출시켜 return값을 받았고, 그 값을return1변수에 저장한다.
		System.out.println(result1);   //(return값이 있으면 리턴값을 받아 변수에 저장해야한다/)
		
		double result2 = c1.divide(10, 20);
		System.out.println(result2);
		
		c1.powerOff();
		

	}

}
