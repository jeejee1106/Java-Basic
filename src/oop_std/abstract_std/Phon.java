package oop_std.abstract_std;

public abstract class Phon {
	
	public String owner;
	public String model;
	
	public Phon(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public void wndls() {
		System.out.println("이" + model + "의 주인은 " + owner + "입니다.");
	}
	
	public void turnOn() {
		System.out.println("전원이 켜집니다");
	}

	public void turnOff() {
		System.out.println("전원이 꺼집니다");
	}
}
