package oop_std.interface_std;

abstract class unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다!");
	}	
}

interface Fightable{ //interface에서의 접근지정자는 무조건 public, 메서드는 무조건 추상(abstract)메서드이다.
	void move(int x, int y); //그렇기 떄문에 public, abstract를 써줘도 되고, 생략해도 무방하다.
	void attack(Fightable f); //왜냐면 안써도 어차피 무조건이기 때문에!!
}

class Fighter extends unit implements Fightable{
	//public을 안써주면 에러남. why? Fightable의 메서드를 오버라이딩 한건데(public 생략되어 있음), 
	//여기서는 접근지정자를 쓰지 않으면 접근지정자가 default가 된다.
	//오버라이딩의 규칙 중 하나가 조상보다 접근제어자가 좁으면 안되기 때문에 public을 붙여준다.
	public void move(int x, int y) { 
		System.out.println("[" + x + "," + y + "] 로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격!");
	}
	
	//싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter를 생성해서 반환
		return f; //f앞에는 (Fightable)이 생략된거임!!
	}
}

public class fighterTest {
	
	public static void main(String[] args) {
		
		
		Fighter f = new Fighter();
		f.move(100,200);
		f.attack(new Fighter());
		f.stop();
		
		Fightable f2 = f.getFightable(); //왜 쓴거지!!!??
		
//		unit u = new Fighter(); //unit도 가능!! but attack메서드는 불가능. 안가지고 있잖아?? 여기 잘 이해 안감..!..!
//		u.move(100, 200);
//		//u.attack(new Fighter());
//		u.stop();
		
//		Fightable f1 = new Fighter(); //Fightable도 가능!!!but stop메서드는 불가능. 안가지고 있잖아!
//		f1.move(100,200);
//		f1.attack(new Fighter());
//		//f1.stop();
		
		
	}

}
