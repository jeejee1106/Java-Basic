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
		System.out.println("�θ� : �� �̸��� " + this.name + "�̰�, ���̴�" + this.age + "���̾�.");
		System.out.println("�θ� : �ڽİ�ü���� ȣ���غ��ž�.");
	}
	
}

class Child2 extends Parent2 {
	
	String hobby;
	
	Child2(){
//		super(); //�ڽ��� ����Ʈ �����ڿ��� super�� �ڵ����� ����, �����Ǿ� �ִ�.
				//�ڽ��� ����Ʈ �����ڴ� �ִµ� �θ��� ����Ʈ �����ڴ� ���� ��� ������ ������ ����.
				//�ذ��� : 1��. �θ�Ŭ�������� ����Ʈ �����ڸ� �����.
						 //2��. �ڽĵ���Ʈ�����ڿ� super();�� ������ �� ��ȣ �ȿ� �ʱⰪ�� �Է����ش�. ��!
	}
	
	Child2(String hobby){
		this.hobby = hobby;
	}
	
	Child2(String name, int age){
		super(name, age); //�θ�Ŭ������ �ʵ尪�� ���������ڰ� private�̸�  super�� �����!
						  //�θ�Ŭ������ �ʵ尪�� ���������ڰ� ����Ʈ�� this�� ȣ�Ⱑ��~
	}
	
	Child2(String name, int age, String hobby){
		super(name, age);
		this.hobby = hobby; //�θ������+�ڽĻ������� ���յ� �翬�� ����!
	}
	
	public void cProcess() { //������ �ڽ�Ŭ������ �޼��带 ���� ����� ����� ����ڵ带 �ٽ� �ۼ��ߴ�. ���� �ҽ����Ͽ� �������̵��� ����� �� �����ϰ�!
		super.process();
		System.out.println("��̴� " + hobby);
	}
}

public class Ex02_super {

	public static void main(String[] args) {
		
		Child2 c1 = new Child2();
		c1.process();
		System.out.println();
		
		Child2 c2 = new Child2("����");
		c2.cProcess();
		System.out.println();
		
		Child2 c3 = new Child2("�θ�", 50);
		c3.process();
		System.out.println();
		
		Child2 c4 = new Child2("�θ�2", 55, "�");
		c4.cProcess(); //������ �ڽ�Ŭ������ �޼��带 ���� ����� ����� ����ڵ带 �ٽ� �ۼ��ߴ�. ���� �ҽ����Ͽ� �������̵��� ����� �� �����ϰ�!
		
	}

}
