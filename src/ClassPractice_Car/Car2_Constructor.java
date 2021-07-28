package ClassPractice_Car;
//하나의 소스 파일에는 하나의 클래스가 있는것이 바람직하지만, 지금은 클래스를 생성하고 객체를 생성, 사용하는 연습을 하는 것이니 두개의 클래스를 만들었다
//생성자?인스턴스변수(객체or필드)를 초기화 하는 메서드
//클래스에 명시적으로 생성자를 선언해보자!
//여기서는 선언 까지만!!!! 객체 생성 후 출력은 다음 파일에서!!!!!!!
class Car2{
	//필드
	String model;
	String color;
	int maxSpeed;
	
	//생성자(생성자 이름은 class이름과 같아야한다.)
	Car2(String model, String color, int maxSpeed){
  //생성자이름(매개변수 선언, 매개변수 선언, 매개변수 선언) { 객체의 초기화 코드 }		
	} 
	//생성자는 초기화 코드를 작성해야 하기 때문에 세미콜론이 아닌 중괄호{}가 뒤에 붙어야 한다. 초기화 코드는 뒤에서 배움!
	//이렇게 클래스에 생성자가 명시적으로 선언되어 있을 경우에는 반드시 선언된 생성자를 호출해서 객체를 생성해야함
	//Car2클래스에 생성자 선언이 있기 때문에 기본생성자를 호출해서 객체를 생성할 수 없고, Car2를 호출해서 객체를 생성해야 한다.
}

public class Car2_Constructor {

	public static void main(String[] args) {
		//Car2클래스에 생성자 선언이 있기 때문에 기본생성자를 호출해서 객체를 생성할 수 없고, Car2를 호출해서 객체를 생성해야 한다.
//		Car2 c1 = new Car2();  //이렇게 기본생성자는 호출이 안된다는 소리!
		Car2 c1 = new Car2("HYUNDAI", "black", 300); //이렇게 클래스에서 선언한 Car(~,~,~)를 호출해서 객체를 생성해야 한다!
		
		System.out.println(c1.model + c1.color + c1.maxSpeed); //생성자에 초기화 코드를 안써줘서 지금은 자동초기화 값으로 출력된다.
															   //null, null, 0
		
		
	}

}
