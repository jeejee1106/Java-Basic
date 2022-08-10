package oop_std.abstract_std;

public class SmartPhon extends Phon{
	
	public SmartPhon(String model, String owner) {
		super(model,owner);
	}
	
	
	public void internet() {
		System.out.println("인터넷 검색을 시작합니다");
	}

}


