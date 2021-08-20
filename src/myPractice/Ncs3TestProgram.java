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
		System.out.println("�߰��� �л����� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("���̸� �Է����ּ���.");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("������ �Է����ּ���");
		int score = Integer.parseInt(sc.nextLine());
		Student student = new Student(name, age, score);
		list.add(student);
		
		System.out.println("�߰� �Ǿ����ϴ�!!");
	}
	
	public void allStudent() {
		int num = 0;
		if(list.size() == 0) {
			System.out.println("<��ϵ� �л��� �����ϴ�.>");
		} else {
			System.out.println("\t<�л� �����Դϴ�!>");
			System.out.println("��ȣ\t�л���\t����\t����");
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
			System.out.println("������ ������ �����ϴ�." + e.getMessage());
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
			System.out.println("�� " + list.size() + "���� �л� ������ �ҷ��ɴϴ�.");
			
		} catch (FileNotFoundException e) {
			System.out.println("�ҷ��� ������ �����ϴ�." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
		
	public void process() {
		while(true) {
			System.out.println("1.�л��߰� 2.��ü��� 3.���� �� ����");
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
				System.out.println("����Ǿ����ϴ�. �����մϴ�");
				System.exit(0);
			default:
				System.out.println("1~4���� ������ �ּ���");
			}
		}
	}


	public static void main(String[] args) {
		Ncs3TestProgram ncs = new Ncs3TestProgram();
		ncs.process();
	}

}
