package ClassPractice_Car;
//�ϳ��� �ҽ� ���Ͽ��� �ϳ��� Ŭ������ �ִ°��� �ٶ���������, ������ Ŭ������ �����ϰ� ��ü�� ����, ����ϴ� ������ �ϴ� ���̴� �ΰ��� Ŭ������ �������
//�ʵ� �ʱ�ȭ : ��ü���� �������� �ܺο��� �����Ǵ� �پ��� ����� �ʱ�ȭ �Ǿ�� �Ѵٸ� �����ڿ��� �ʱ�ȭ�� ���־�� �Ѵ�.
class Car3{
	//�ʵ�
	String company = "HYUNDAI";
	String name; //�ʱⰪ ����
	String maxSpeed;  //�ʱⰪ ����
	
	//��������� ������ ����
	Car3(String n, String s){
		name = n; //�����ڿ����� �ʵ� �ʱ�ȭ
		maxSpeed = s;
		
//	Car3(String name, String maxSpeed){ //���������� �Ű������� �ʵ忡���� ������ �����̸����� �����Ѵ�.(������ ������)
//		this.name = name; //������ ���ο����� �Ű������� �켱������ ���� ������ �Ű�����-�ʵ庯��(?)�� �����ϱ� ����
//		this.maxSpeed = maxSpeed; //�ʵ庯���� �տ��� this.�� ������!!!
//		//�� �ҽ� ���Ͽ����� ���� �ڵ�� �ϴ� ����, ���� ���� ���� �̷������� ������ ����.
//	}
	}
}

public class Car3_ThisField {

	public static void main(String[] args) {
		
		Car3 c1 = new Car3("SORENTO", "250");
		//SORENTO�� �����ڿ��� ������ ���� n�� �� -> n�� �ʵ��� name������ ��.
		Car3 c2 = new Car3("GENESISS", "300");
		System.out.println(c1.company + "-" +c1.name +"�� �ִ�ӵ���" + c1.maxSpeed + "km�Դϴ�");
		System.out.println(c2.company + "-" +c2.name +"�� �ִ�ӵ���" + c2.maxSpeed + "km�Դϴ�");
		
		
	}

}
