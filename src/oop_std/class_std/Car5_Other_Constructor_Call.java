package oop_std.class_std;
//하나의 소스 파일에는 하나의 클래스가 있는것이 바람직하지만, 지금은 클래스를 생성하고 객체를 생성, 사용하는 연습을 하는 것이니 두개의 클래스를 만들었다
//다른 생성자 호출
//왜 호출해? 코드의 중복을 막기위해
class Car5{
	//필드
	String company = "HYUNDAI";
	String model;
	String color;
	int maxSpeed;
	int cc;
	
	//생성자
	Car5(){ //1번
		
	}
	Car5(String model){ //2번
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		
		//위 세개의 초기화 코드는 다른 생성자들의 코드와 비슷하게 생겼고, 중복된다고 볼 수 있다.
		//이 중복된 코드를 다른 생성자(여기선 4번생성자)에 몰아서 작성해놓고, 그 생성자를 this();로 호출한다.
		this(model, null, 0); //매개변수는 호출할 생성자의 타입에 맞게 작성!!!!
	}
	Car5(String model, String color){ //3번
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
		this(model, color, 0); //이 this코드는 반드시 생성자의 첫줄에서만 작성할 수 있다!!!!!!이유는 없음. 그냥 그렇게 만듦. 문법임.
	}
	Car5(String model, String color, int maxSpeed){ //4번 - 호출된 생성자!!!!!!!!!!
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} 
	
}

public class Car5_Other_Constructor_Call {

	public static void main(String[] args) {
		Car5 c1 = new Car5(); 
		System.out.println("c1-1번생성자 : " + c1.company);
		
		Car5 c2 = new Car5("SORENTO");
		System.out.println("c2-2번생성자 : " + c2.company + ", " + c2.model);
		
		Car5 c3 = new Car5("SONATA", "white");
		System.out.println("c3-3번생성자 : " + c3.company + ", " + c3.model + ", " + c3.color);
		
		Car5 c4 = new Car5("GENESISS", "black", 300);
		System.out.println("c4-4번생성자 : " + c4.company + ", " + c4.model + ", " + c4.color + ", " + c4.maxSpeed);
		
		//이 부분은 Car4와 같은 코드이다. 클래스부분의 내용이 변경되었지만 같은 결과가 출력된다는 것을 알 수 있다.
		
	}

}
