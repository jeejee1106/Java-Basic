package oop_std.abstract_std;

public abstract class Phon {
	
	public String owner;
	public String model;
	
	public Phon(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public void wndls() {
		System.out.println("��" + model + "�� ������ " + owner + "�Դϴ�.");
	}
	
	public void turnOn() {
		System.out.println("������ �����ϴ�");
	}

	public void turnOff() {
		System.out.println("������ �����ϴ�");
	}
}
