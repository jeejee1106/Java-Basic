package ClassPractice_Car;
//�ϳ��� �ҽ� ���Ͽ��� �ϳ��� Ŭ������ �ִ°��� �ٶ���������, ������ Ŭ������ �����ϰ� ��ü�� ����, ����ϴ� ������ �ϴ� ���̴� �ΰ��� Ŭ������ �������
//�����ڴ� �������� ���� �� �ִ�.
//�������� �����ε� : �Ű������� �޸��ϴ� �����ڸ� ���� �� �����ϴ� ���� ���Ѵ�.
//�� ��? �ܺ��� ���� � Ÿ������ �r���� �������� �𸣱� ������ �����ڵ� �پ����� �ʿ䰡 ����
class Car4{
	//�ʵ�
	String company = "HYUNDAI";
	String model;
	String color;
	int maxSpeed;
	int cc;
	
	//������
	Car4(){ //1��
		//�ʱ�ȭ �ڵ尡 ���ٸ� �ڵ��ʱ�ȭ������ ������. 
	}
	Car4(String model){ //2��
		this.model = model;
	}
	Car4(String model, String color){ //3��
		this.model = model;
		this.color = color;
	}
	Car4(String model, String color, int maxSpeed){ //4��
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} //4��,5�� ������ó�� �Ű������� ������ ���Ƶ� Ÿ���� ������ �ٸ��� �����ε�!
	Car4(String model, int cc, int maxSpeed){ //5��
	} 
//	Car4(String name, int speed, int maxSpeed){} //6��
	//but, 5��, 6�� ������ó�� Ÿ���� ������ ���� ������ ���� �����ڴ¿����ε��̶�� �� �� ����.(�����߻�)
	Car4(int cc, int maxSpeed, String model){} //7��
	//�ٵ� �� 5��, 7�� ������ó�� Ÿ���� ������ �ٸ��� �����ε�.. ��...
	
}

public class Car4_Constructor_OverLoding {

	public static void main(String[] args) {
		Car4 c1 = new Car4(); //1�� ������ ����
		System.out.println("c1-1�������� : " + c1.company);
		
		Car4 c2 = new Car4("SORENTO");
		System.out.println("c2-2�������� : " + c2.company + ", " + c2.model);
		
		Car4 c3 = new Car4("SONATA", "white");
		System.out.println("c3-3�������� : " + c3.company + ", " + c3.model + ", " + c3.color);
		
		Car4 c4 = new Car4("GENESISS", "black", 300);
		System.out.println("c4-4�������� : " + c4.company + ", " + c4.model + ", " + c4.color + ", " + c4.maxSpeed);
		
		
	}

}
