package abstractPractice;

public class PhonExample {

	public static void main(String[] args) {
		
		SmartPhon sp = new SmartPhon("����Ʈ��", "��ȣ��");
		sp.wndls();
		sp.turnOn();
		sp.turnOff();
		sp.internet();
		System.out.println();
		
		DmbPhon dp = new DmbPhon("DMB��", "���缮");
		dp.wndls();
		dp.turnOn();
		dp.turnOff();
		dp.tvOn();
		
		
		
		
	}

}
