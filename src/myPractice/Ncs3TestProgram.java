package myPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class Ncs3TestProgram {
	static final String FILENAME = "D:\\bitjava0719\\javawork\\Ncs3test.txt";
	Vector<Student> list = new Vector<Student>();
	Scanner sc = new Scanner(System.in);
	
	public Ncs3TestProgram() {
		objectInputFile();
	}
	
	
	public void addStudent() {
		System.out.println("추가할 학생명을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("점수를 입력해주세요");
		int score = Integer.parseInt(sc.nextLine());
		Student student = new Student(name, age, score);
		list.add(student);
		
		System.out.println("추가 되었습니다!!");
	}
	
	public void allStudent() {
		int num = 0;
		if(list.size() == 0) {
			System.out.println("<등록된 학생이 없습니다.>");
		} else {
			System.out.println("\t<학생 정보입니다!>");
			System.out.println("번호\t학생명\t나이\t점수");
			System.out.println("=============================");
			for(Student s : list) {
			System.out.println(++num + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getScore());
			} 
		}
	}
	
	public void objectOutputFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			System.out.println("저장할 정보가 없습니다." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void objectInputFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(fis);
			list = (Vector<Student>)ois.readObject();
			System.out.println("총 " + list.size() + "명의 학생 정보를 불러옵니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("불러올 정보가 없습니다." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
		
	public void process() {
		while(true) {
			System.out.println("1.학생추가 2.전체출력 3.종료 및 저장");
			int n = Integer.parseInt(sc.nextLine());

			switch(n) {
			case 1:
				addStudent();
				break;
			case 2:
				allStudent();
				break;
			case 3:
				objectOutputFile();
				System.out.println("저장되었습니다. 종료합니다");
				System.exit(0);
			default:
				System.out.println("1~4번중 선택해 주세요");
			}
		}
	}


	public static void main(String[] args) {
		Ncs3TestProgram ncs = new Ncs3TestProgram();
		ncs.process();
	}

}
