package ClassPractice_Car;
//�ϳ��� �ҽ� ���Ͽ��� �ϳ��� Ŭ������ �ִ°��� �ٶ���������, ������ Ŭ������ �����ϰ� ��ü�� ����, ����ϴ� ������ �ϴ� ���̴� �ΰ��� Ŭ������ �������
//Ŭ������ �ʵ�(�ν��Ͻ�����, Ŭ��������)����
class Car {	
	//car�� �Ӽ�
	static String model = "Hyundai";
	static int maxSpeed = 300; // �� �ΰ��� ������ Ŭ���� �������� ������ �ư� �տ� static�� �پ��ִ�.
							   // �̰��� Ŭ��������(c=class variable)��� �Ѵ�.
							   // ���������� ����ϴ� �Ӽ��� class variable�� ����Ѵ�.
							   // ��..�ڹ��� ���������� ���Ͱ���(�������) ���������� �̰��� �ڹٴ� ������ �̰��� '�������´� ������ ��������� �̰��� �ʵ�(field)��� �Ѵ�'
							   // ������ �ʵ��� ���̷δ� ���� : �����ڿ� �޼ҵ� �������� ����� �����ϰ� �����ڿ� �޼ҵ尡 ��������Ǹ� �ڵ� �Ҹ�ȴ�.
							   //				     �ʵ� : �����ڿ� �޼ҵ� �ۿ����� ����� �����ϰ� ��ü�� �Ҹ����� �ʴ� �� ��ü�� �Բ� �����Ѵ�.
	
	String color; // �� �ΰ��� ������ Ŭ���� �������� ������ �ƴ�. 
	int speed;    // �̰��� �ν��Ͻ� ����(instance variable)��� �Ѵ�.
				  // ���������� ����ϴ� �Ӽ��� instance variable�� ����Ѵ�.

}

public class Car1_Field {

	public static void main(String[] args) {
		
		System.out.println("c1�� �𵨸��� " + Car.model + "�Դϴ�.");
		System.out.println("c1�� �ִ� �ӵ��� " + Car.maxSpeed + "�Դϴ�.");
		System.out.println("c2�� �𵨸��� " + Car.model + "�Դϴ�.");
		System.out.println("c2�� �ִ� �ӵ��� " + Car.maxSpeed + "�Դϴ�."); //Ŭ���������� ��ü�� ���� ���̵� ��밡���ϴ�.
		
		Car c1 = new Car(); //c1,c2,c3�� ����������� �Ѵ�. -> ��ü�� ����
		Car c2 = new Car(); //new Car���� Car�� �����ڶ�� �Ѵ�. (���⼭�� �⺻������)
		Car c3 = new Car();

		System.out.println("c1�� ���� �ӵ��� " + c1.speed + "�Դϴ�."); //�ν��Ͻ� ������ ��ü�� �����ؾ� ����� �� �ִ�. �ʱⰪ�� ���� ���� �ν��Ͻ������� �ڵ��ʱ�ȭ�� �ȴ�.
		
		c1.color = "black"; //��ü�� ���
		c2.color = "white";
		c3.color = "black";
		c1.speed = 60;
		c2.speed = 100;
		c3.speed = 80;
		
		Car.model = "KIA"; //Ŭ���� ���� ����
		
		System.out.println("c1�� ������ " + c1.color + "�Դϴ�.");
		System.out.println("c1�� ���� �ӵ��� " + c1.speed + "�Դϴ�.");
		System.out.println("c2�� ������ " + c2.color + "�Դϴ�.");
		System.out.println("c2�� ���� �ӵ��� " + c2.speed + "�Դϴ�.");
		System.out.println("c2�� �𵨸��� " + Car.model + "�Դϴ�.");
		System.out.println("c3�� ������ " + c3.color + "�Դϴ�.");
		System.out.println("c3�� ���� �ӵ��� " + c3.speed + "�Դϴ�.");
		System.out.println("c3�� �ִ� �ӵ��� " + Car.maxSpeed + "�Դϴ�.");
		//Ŭ���������� c3.maxSpeed ��� �ᵵ ������ �ν��Ͻ������� �����ϱ� ���� Car.maxSeed ��� ���°� �ٶ����ϴ�.
		//����c3.maxSpeed = 500�̶�� ���� ����� Ŭ���������� �ٲ�Ŷ� c1,c2�� maxSeepd���� 500�� �����µ�,
		//���������� c3�� ���� '�� ��ü c3�� maxSpeed�� 500�̱���' ��� ������ �� �ִ�.

	}

}

