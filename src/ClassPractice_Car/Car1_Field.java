package ClassPractice_Car;
//하나의 소스 파일에는 하나의 클래스가 있는것이 바람직하지만, 지금은 클래스를 생성하고 객체를 생성, 사용하는 연습을 하는 것이니 두개의 클래스를 만들었다
//클래스에 필드(인스턴스변수, 클래스변수)선언
class Car {	
	//car의 속성
	static String model = "Hyundai";
	static int maxSpeed = 300; // 이 두개의 변수는 클래스 영역에서 선언이 됐고 앞에 static이 붙어있다.
							   // 이것을 클래스변수(c=class variable)라고 한다.
							   // 공통적으로 사용하는 속성은 class variable을 사용한다.
							   // 음..자바의 정석에서는 위와같이(변수라고) 설명했지만 이것이 자바다 에서는 이것을 '선언형태는 변수와 비슷하지만 이것은 필드(field)라고 한다'
							   // 변수와 필드의 차이로는 변수 : 생성자와 메소드 내에서만 사용이 가능하고 생성자와 메소드가 실행종료되면 자동 소멸된다.
							   //				     필드 : 생성자와 메소드 밖에서도 사용이 가능하고 객체가 소멸하지 않는 한 객체와 함께 존재한다.
	
	String color; // 이 두개의 변수는 클래스 영역에서 선언이 됐다. 
	int speed;    // 이것을 인스턴스 변수(instance variable)라고 한다.
				  // 개별적으로 사용하는 속성은 instance variable을 사용한다.

}

public class Car1_Field {

	public static void main(String[] args) {
		
		System.out.println("c1의 모델명은 " + Car.model + "입니다.");
		System.out.println("c1의 최대 속도는 " + Car.maxSpeed + "입니다.");
		System.out.println("c2의 모델명은 " + Car.model + "입니다.");
		System.out.println("c2의 최대 속도는 " + Car.maxSpeed + "입니다."); //클래스변수는 객체의 생성 없이도 사용가능하다.
		
		Car c1 = new Car(); //c1,c2,c3는 참조변수라고 한다. -> 객체의 생성
		Car c2 = new Car(); //new Car에서 Car는 생성자라고 한다. (여기서는 기본생성자)
		Car c3 = new Car();

		System.out.println("c1의 현재 속도는 " + c1.speed + "입니다."); //인스턴스 변수는 객체를 생성해야 사용할 수 있다. 초기값을 주지 않은 인스턴스변수는 자동초기화가 된다.
		
		c1.color = "black"; //객체의 사용
		c2.color = "white";
		c3.color = "black";
		c1.speed = 60;
		c2.speed = 100;
		c3.speed = 80;
		
		Car.model = "KIA"; //클래스 변수 변경
		
		System.out.println("c1의 색깔은 " + c1.color + "입니다.");
		System.out.println("c1의 현재 속도는 " + c1.speed + "입니다.");
		System.out.println("c2의 색깔은 " + c2.color + "입니다.");
		System.out.println("c2의 현재 속도는 " + c2.speed + "입니다.");
		System.out.println("c2의 모델명은 " + Car.model + "입니다.");
		System.out.println("c3의 색깔은 " + c3.color + "입니다.");
		System.out.println("c3의 현재 속도는 " + c3.speed + "입니다.");
		System.out.println("c3의 최대 속도는 " + Car.maxSpeed + "입니다.");
		//클래스변수는 c3.maxSpeed 라고 써도 되지만 인스턴스변수와 구분하기 위해 Car.maxSeed 라고 쓰는게 바람직하다.
		//만약c3.maxSpeed = 500이라고 쓰면 사실은 클래스변수가 바뀐거라 c1,c2의 maxSeepd값도 500이 나오는데,
		//참조변수를 c3를 보고 '아 객체 c3만 maxSpeed가 500이구나' 라고 오해할 수 있다.

	}

}

