package InheritancePractice;

class Parent{ //부모(조상)클래스
	
	public void parentMethod() {
		System.out.println("나는 부모클래스의 메서드야.");
	}
}

class Child extends Parent { //부모 클래스를 상속받기 위한코드!
	
	public void childMethod() { //자식(자손)클래스
		System.out.println("나는 자식클래스의 메서드야.");
	}
}

public class Ex01_MethodCall {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parentMethod();
		
		Child c = new Child(); 
		c.parentMethod(); //자식 클래스는 부모 클래스의 메서드를 호출할 수 있다!!!!!
		c.childMethod();  //물론 본인것도 당연히 가능하구.
	}

}
