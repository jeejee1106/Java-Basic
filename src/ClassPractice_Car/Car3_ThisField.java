package ClassPractice_Car;
//하나의 소스 파일에는 하나의 클래스가 있는것이 바람직하지만, 지금은 클래스를 생성하고 객체를 생성, 사용하는 연습을 하는 것이니 두개의 클래스를 만들었다
//필드 초기화 : 객체생성 시점에서 외부에서 제공되는 다양한 값들로 초기화 되어야 한다면 생성자에서 초기화를 해주어야 한다.
class Car3{
	//필드
	String company = "HYUNDAI";
	String name; //초기값 안줌
	String maxSpeed;  //초기값 안줌
	
	//명시적으로 생성자 선언
	Car3(String n, String s){
		name = n; //생성자에서의 필드 초기화
		maxSpeed = s;
		
//	Car3(String name, String maxSpeed){ //관례적으로 매개변수는 필드에서의 변수와 같은이름으로 지정한다.(가독성 때문에)
//		this.name = name; //생성자 내부에서는 매개변수가 우선순위를 갖기 때문에 매개변수-필드변수(?)를 구분하기 위해
//		this.maxSpeed = maxSpeed; //필드변수명 앞에는 this.을 붙힌다!!!
//		//이 소스 파일에서는 위의 코드로 일단 쓰고, 다음 파일 부턴 이런식으로 쓰도록 하자.
//	}
	}
}

public class Car3_ThisField {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3("SORENTO", "250");
		//SORENTO가 생성자에서 선언한 변수 n에 들어감 -> n은 필드의 name변수에 들어감.
		Car3 c2 = new Car3("GENESISS", "300");
		System.out.println(c1.company + "-" +c1.name +"의 최대속도는" + c1.maxSpeed + "km입니다");
		System.out.println(c2.company + "-" +c2.name +"의 최대속도는" + c2.maxSpeed + "km입니다");
		
		
	}

}
