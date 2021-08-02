package abstractPractice;

public class PhonExample {

	public static void main(String[] args) {
		
		SmartPhon sp = new SmartPhon("스마트폰", "강호동");
		sp.wndls();
		sp.turnOn();
		sp.turnOff();
		sp.internet();
		System.out.println();
		
		DmbPhon dp = new DmbPhon("DMB폰", "유재석");
		dp.wndls();
		dp.turnOn();
		dp.turnOff();
		dp.tvOn();
		
		
		
		
	}

}
