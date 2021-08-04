//����� ���� Exception �����
//������ ó�� ����� �� ��������� Exception...���� ����? ���� ���� �ʴ�.
package exception;

import java.util.Scanner;

public class Exe2 {
	Scanner sc = new Scanner(System.in);

	public class WrongIdException extends Exception {
		WrongIdException(){

		}
		WrongIdException(String message){
			super(message);
		}
	}

	public class WrongPasswordException extends Exception{
		WrongPasswordException(){

		}
		WrongPasswordException(String message){
			super(message);
		}

	}

	public void login() throws WrongIdException, WrongPasswordException {

		System.out.println("ID�� �Է����ּ���.");
		String id = sc.nextLine();
		if(!id.equals("helloworld")) {
			throw new WrongIdException("�߸��� ID�Դϴ�.");
		} 

		System.out.println("��й�ȣ�� �Է����ּ���.");
		String pass = sc.nextLine();
		if(!pass.equals("1234")) {
			throw new WrongPasswordException("�߸��� Password�Դϴ�.");
		}
		System.out.println("Hello, World!!!!!!");
		System.exit(0);
	} 



	public void process() {
		while(true) {
			try {
				login();
			} catch (WrongIdException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				continue;
			} catch (WrongPasswordException e) {
				System.out.println(e.getMessage());
				continue;
			}

		}
	}

	public static void main(String[] args) {
		Exe2 ex = new Exe2();
		ex.process();

	}

}
