package ClassPractice_Car;
//�ϳ��� �ҽ� ���Ͽ��� �ϳ��� Ŭ������ �ִ°��� �ٶ���������, ������ Ŭ������ �����ϰ� ��ü�� ����, ����ϴ� ������ �ϴ� ���̴� �ΰ��� Ŭ������ �������
//�ٸ� ������ ȣ��
//�� ȣ����? �ڵ��� �ߺ��� ��������
class Car5{
	//�ʵ�
	String company = "HYUNDAI";
	String model;
	String color;
	int maxSpeed;
	int cc;
	
	//������
	Car5(){ //1��
		
	}
	Car5(String model){ //2��
		/*this.model = model;
		this.color = null;
		this.maxSpeed = 0;*/
		
		//�� ������ �ʱ�ȭ �ڵ�� �ٸ� �����ڵ��� �ڵ�� ����ϰ� �����, �ߺ��ȴٰ� �� �� �ִ�.
		//�� �ߺ��� �ڵ带 �ٸ� ������(���⼱ 4��������)�� ���Ƽ� �ۼ��س���, �� �����ڸ� this();�� ȣ���Ѵ�.
		this(model, null, 0); //�Ű������� ȣ���� �������� Ÿ�Կ� �°� �ۼ�!!!!
	}
	Car5(String model, String color){ //3��
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 0;
		this(model, color, 0); //�� this�ڵ�� �ݵ�� �������� ù�ٿ����� �ۼ��� �� �ִ�!!!!!!������ ����. �׳� �׷��� ����. ������.
	}
	Car5(String model, String color, int maxSpeed){ //4�� - ȣ��� ������!!!!!!!!!!
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} 
	
}

public class Car5_Other_Constructor_Call {

	public static void main(String[] args) {
		Car5 c1 = new Car5(); 
		System.out.println("c1-1�������� : " + c1.company);
		
		Car5 c2 = new Car5("SORENTO");
		System.out.println("c2-2�������� : " + c2.company + ", " + c2.model);
		
		Car5 c3 = new Car5("SONATA", "white");
		System.out.println("c3-3�������� : " + c3.company + ", " + c3.model + ", " + c3.color);
		
		Car5 c4 = new Car5("GENESISS", "black", 300);
		System.out.println("c4-4�������� : " + c4.company + ", " + c4.model + ", " + c4.color + ", " + c4.maxSpeed);
		
		//�� �κ��� Car4�� ���� �ڵ��̴�. Ŭ�����κ��� ������ ����Ǿ����� ���� ����� ��µȴٴ� ���� �� �� �ִ�.
		
	}

}
