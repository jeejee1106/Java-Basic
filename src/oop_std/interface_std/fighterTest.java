package oop_std.interface_std;

abstract class unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����ϴ�!");
	}	
}

interface Fightable{ //interface������ ���������ڴ� ������ public, �޼���� ������ �߻�(abstract)�޼����̴�.
	void move(int x, int y); //�׷��� ������ public, abstract�� ���൵ �ǰ�, �����ص� �����ϴ�.
	void attack(Fightable f); //�ֳĸ� �Ƚᵵ ������ �������̱� ������!!
}

class Fighter extends unit implements Fightable{
	//public�� �Ƚ��ָ� ������. why? Fightable�� �޼��带 �������̵� �Ѱǵ�(public �����Ǿ� ����), 
	//���⼭�� ���������ڸ� ���� ������ ���������ڰ� default�� �ȴ�.
	//�������̵��� ��Ģ �� �ϳ��� ���󺸴� ���������ڰ� ������ �ȵǱ� ������ public�� �ٿ��ش�.
	public void move(int x, int y) { 
		System.out.println("[" + x + "," + y + "] �� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f + "�� ����!");
	}
	
	//�ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		Fighter f = new Fighter(); //Fighter�� �����ؼ� ��ȯ
		return f; //f�տ��� (Fightable)�� �����Ȱ���!!
	}
}

public class fighterTest {
	
	public static void main(String[] args) {
		
		
		Fighter f = new Fighter();
		f.move(100,200);
		f.attack(new Fighter());
		f.stop();
		
		Fightable f2 = f.getFightable(); //�� ������!!!??
		
//		unit u = new Fighter(); //unit�� ����!! but attack�޼���� �Ұ���. �Ȱ����� ���ݾ�?? ���� �� ���� �Ȱ�..!..!
//		u.move(100, 200);
//		//u.attack(new Fighter());
//		u.stop();
		
//		Fightable f1 = new Fighter(); //Fightable�� ����!!!but stop�޼���� �Ұ���. �Ȱ����� ���ݾ�!
//		f1.move(100,200);
//		f1.attack(new Fighter());
//		//f1.stop();
		
		
	}

}
