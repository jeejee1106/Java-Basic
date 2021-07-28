package ClassPractice_Car;
//하나의 소스 파일에는 하나의 클래스가 있는것이 바람직하지만, 지금은 클래스를 생성하고 객체를 생성, 사용하는 연습을 하는 것이니 두개의 클래스를 만들었다
//생성자는 여러개를 만들 수 있다.
//생성자의 오버로딩 : 매개변수를 달리하는 생성자를 여러 개 선언하는 것을 말한다.
//왜 해? 외부의 값이 어떤 타입으로 몉개가 제공될지 모르기 때문에 생성자도 다양해질 필요가 있음
class Car4{
	//필드
	String company = "HYUNDAI";
	String model;
	String color;
	int maxSpeed;
	int cc;
	
	//생성자
	Car4(){ //1번
		//초기화 코드가 없다면 자동초기화값으로 설정됨. 
	}
	Car4(String model){ //2번
		this.model = model;
	}
	Car4(String model, String color){ //3번
		this.model = model;
		this.color = color;
	}
	Car4(String model, String color, int maxSpeed){ //4번
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} //4번,5번 생성자처럼 매개변수의 갯수는 같아도 타입의 갯수가 다르면 오버로딩!
	Car4(String model, int cc, int maxSpeed){ //5번
	} 
//	Car4(String name, int speed, int maxSpeed){} //6번
	//but, 5번, 6번 생성자처럼 타입의 갯수와 선언 순서가 같은 생성자는오버로딩이라고 볼 수 없다.(에러발생)
	Car4(int cc, int maxSpeed, String model){} //7번
	//근데 또 5번, 7번 생성자처럼 타입의 순서가 다른건 오버로딩.. 흠...
	
}

public class Car4_Constructor_OverLoding {

	public static void main(String[] args) {
		Car4 c1 = new Car4(); //1번 생성자 선택
		System.out.println("c1-1번생성자 : " + c1.company);
		
		Car4 c2 = new Car4("SORENTO");
		System.out.println("c2-2번생성자 : " + c2.company + ", " + c2.model);
		
		Car4 c3 = new Car4("SONATA", "white");
		System.out.println("c3-3번생성자 : " + c3.company + ", " + c3.model + ", " + c3.color);
		
		Car4 c4 = new Car4("GENESISS", "black", 300);
		System.out.println("c4-4번생성자 : " + c4.company + ", " + c4.model + ", " + c4.color + ", " + c4.maxSpeed);
		
		
	}

}
