package oop_std.method_std;

class Cal1 { //Cal1 �̶�� Ŭ������ �ִ�

	//�޼��带 �����غ���. �޼���� �޼���� �տ� ����Ÿ���� ��������Ѵ�.
	//���� Ÿ���� ������ ������Ÿ��(9��) + void �� �ִ�
	void powerOn() { //powerOn �޼���� ������ Ű�� �ż� ���ϰ��� �ʿ����.
		System.out.println("������ �����ϴ�.");	 //�׷��� ����ִٴ� ���� ����Ÿ���� void�� ��!
	}

	int plus(int a, int b) { //plus �޼���� ���� ���ϰ� ����� ȣ���� ���� �Ѱܾ��ؼ� intŸ���� ����Ÿ���� �־����.
		int result = a+b;     //�׷��� ���ϵ� result ������ intŸ�Կ� ����
		return result;
	}

	double divide(int a, int b) { //divide �޼���� ���� ������ ����� ȣ���� ���� �Ѱܾ��ؼ�
		double result = a/b;		//double Ÿ���� ����Ÿ���� ��.
		return result;
	}

	void powerOff() {
		System.out.println("������ �����ϴ�.");
	}
}

public class Calculator1 {

	public static void main(String[] args) {

		Cal1 c1 = new Cal1(); //Cal1Ŭ������ ��ü ����
		
		c1.powerOn();//�޼��� ȣ�� (Cal1Ŭ������ �ν��Ͻ��� c1�� �����, �޼��带 ȣ���� ��)
		
		int result1 = c1.plus(10, 20); //plus�޼��带 ȣ����� return���� �޾Ұ�, �� ����return1������ �����Ѵ�.
		System.out.println(result1);   //(return���� ������ ���ϰ��� �޾� ������ �����ؾ��Ѵ�/)
		
		double result2 = c1.divide(10, 20);
		System.out.println(result2);
		
		c1.powerOff();
		

	}

}
