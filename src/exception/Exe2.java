//사용자 정의 Exception 만들기
//스스로 처음 만들어 본 사용자정의 Exception...뭔가 찝찝? 맘에 들지 않다.
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

		System.out.println("ID를 입력해주세요.");
		String id = sc.nextLine();
		if(!id.equals("helloworld")) {
			throw new WrongIdException("잘못된 ID입니다.");
		} 

		System.out.println("비밀번호를 입력해주세요.");
		String pass = sc.nextLine();
		if(!pass.equals("1234")) {
			throw new WrongPasswordException("잘못된 Password입니다.");
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
