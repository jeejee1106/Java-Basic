package oop_std.Inheritance_std;

class Parent2 {
	private String name;
	private int age;
	
	Parent2(){
		
	}
	
	Parent2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void process() {
		System.out.println("부모 : 내 이름은 " + this.name + "이고, 나이는" + this.age + "살이야.");
		System.out.println("부모 : 자식객체에서 호출해볼거야.");
	}
	
}

class Child2 extends Parent2 {
	
	String hobby;
	
	Child2(){
//		super(); //자식의 디폴트 생성자에는 super가 자동으로 생성, 생략되어 있다.
				//자식의 디폴트 생성자는 있는데 부모의 디폴트 생성자는 없는 경우 컴파일 오류가 난다.
				//해결방법 : 1번. 부모클래스에도 디폴트 생성자를 만든다.
						 //2번. 자식디폴트생성자에 super();를 생성한 후 괄호 안에 초기값을 입력해준다. 끝!
	}
	
	Child2(String hobby){
		this.hobby = hobby;
	}
	
	Child2(String name, int age){
		super(name, age); //부모클래스의 필드값의 접근제어자가 private이면  super를 써야함!
						  //부모클래스의 필드값의 접근제어자가 디폴트면 this로 호출가능~
	}
	
	Child2(String name, int age, String hobby){
		super(name, age);
		this.hobby = hobby; //부모생성자+자식생성자의 조합도 당연히 가능!
	}
	
	public void cProcess() { //지금은 자식클래스에 메서드를 새로 만들고 비슷한 출력코드를 다시 작성했다. 다음 소스파일엔 오버라이딩을 배워서 더 간편하게!
		super.process();
		System.out.println("취미는 " + hobby);
	}
}

public class Ex02_super {

	public static void main(String[] args) {
		
		Child2 c1 = new Child2();
		c1.process();
		System.out.println();
		
		Child2 c2 = new Child2("러닝");
		c2.cProcess();
		System.out.println();
		
		Child2 c3 = new Child2("부모", 50);
		c3.process();
		System.out.println();
		
		Child2 c4 = new Child2("부모2", 55, "운동");
		c4.cProcess(); //지금은 자식클래스에 메서드를 새로 만들고 비슷한 출력코드를 다시 작성했다. 다음 소스파일엔 오버라이딩을 배워서 더 간편하게!
		
	}

}
