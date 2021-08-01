package InheritancePractice;

class Aaa{
	private String school;
	private String student;
	private int num;
	
	Aaa(String school, String student, int num){
		this.school = school;
		this.student = student;
		this.num = num;
	}
	
	public void process() {
		System.out.println("�б��̸� : " + school);
		System.out.println("�л��̸� : " + student);
		System.out.println("�л���ȣ : " + num);
	}
}

class Bbb extends Aaa {
	private String hp;
	
	Bbb(String school, String student, int num, String hp){
		super(school, student, num);
		this.hp = hp;
	}
	
	@Override 
	public void process() {  //�θ� Ŭ������ �޼��带 ������� �������̵�! �θ�޼��忡 ��(�ڽ�)�� �޼��带 �߰��ϴ�?? �׷���...
		// TODO Auto-generated method stub
		super.process();
		System.out.println("�ڵ��� ��ȣ : " + hp);
	}
}
	

public class Ex03_OverRiding {

	public static void main(String[] args) {
		
		Bbb bb = new Bbb("��������б�", "���缮", 17, "010-111-1111");
		bb.process();
		
		Bbb bb2 = new Bbb("���ʰ���б�", "��ȣ��", 18, "010-2222-2222");
		bb2.process();
		
		Bbb bb3 = new Bbb("���ǰ���б�", "�̱���", 19, "010-123-4567");
		bb3.process();
		
		
	}

}
