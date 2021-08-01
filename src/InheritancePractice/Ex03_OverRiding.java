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
		System.out.println("학교이름 : " + school);
		System.out.println("학생이름 : " + student);
		System.out.println("학생번호 : " + num);
	}
}

class Bbb extends Aaa {
	private String hp;
	
	Bbb(String school, String student, int num, String hp){
		super(school, student, num);
		this.hp = hp;
	}
	
	@Override 
	public void process() {  //부모 클래스의 메서드를 끌어오는 오버라이드! 부모메서드에 나(자식)의 메서드를 추가하는?? 그런거...
		// TODO Auto-generated method stub
		super.process();
		System.out.println("핸드폰 번호 : " + hp);
	}
}
	

public class Ex03_OverRiding {

	public static void main(String[] args) {
		
		Bbb bb = new Bbb("강남고등학교", "유재석", 17, "010-111-1111");
		bb.process();
		
		Bbb bb2 = new Bbb("서초고등학교", "강호동", 18, "010-2222-2222");
		bb2.process();
		
		Bbb bb3 = new Bbb("관악고등학교", "이광수", 19, "010-123-4567");
		bb3.process();
		
		
	}

}
