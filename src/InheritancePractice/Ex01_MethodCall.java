package InheritancePractice;

class Parent{ //�θ�(����)Ŭ����
	
	public void parentMethod() {
		System.out.println("���� �θ�Ŭ������ �޼����.");
	}
}

class Child extends Parent { //�θ� Ŭ������ ��ӹޱ� �����ڵ�!
	
	public void childMethod() { //�ڽ�(�ڼ�)Ŭ����
		System.out.println("���� �ڽ�Ŭ������ �޼����.");
	}
}

public class Ex01_MethodCall {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parentMethod();
		
		Child c = new Child(); 
		c.parentMethod(); //�ڽ� Ŭ������ �θ� Ŭ������ �޼��带 ȣ���� �� �ִ�!!!!!
		c.childMethod();  //���� ���ΰ͵� �翬�� �����ϱ�.
	}

}
