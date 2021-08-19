package myPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

class Player implements Serializable{
	String name;
	int backNumber;
	String position;
	
	public Player() {

	}
	
	public Player(String name, int backNumber, String position) {
		this.name = name;
		this.backNumber = backNumber;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public String getPosition() {
		return position;
	}
	
	
	
}
public class MySerializable {
	static final String FILENAME = "C:\\Users\\PC\\Desktop\\study\\KIA_Player.txt";
	Vector<Player> list = new Vector<Player>(); //Player class��   Vector�� ����
	Scanner sc = new Scanner(System.in);
	
	public MySerializable() { //default ������. ���⿡ ������ �д� �޼��带 ȣ���Ѵ�. �����Ű�ڸ��� ������ �б� ����!
		objectInputFile();
		process(); //�� �ΰ��� �޼���� ���θ޼��忡�� ��ü�� ������ �� �ű⼭ ȣ�����൵ ��!!!
	}
	
	public void addPlayer() {
		System.out.println("����� �������� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("���ȣ�� �Է����ּ���.");
		int backNumber = Integer.parseInt(sc.nextLine());
		System.out.println("�������� �Է����ּ���");
		String position = sc.nextLine();
		
		Player player = new Player(name, backNumber, position); //��ĳ�ʷ� ���� �̸�,���ȣ,�������� player��ü�� ���
		list.add(player); //player��ü�� list�� �߰��Ѵ�.
		
		System.out.println("��������� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deletePlayer() {
		System.out.println("������ �������� �Է����ּ���");
		String name = sc.nextLine();
		
		boolean result = false; //for���� ���� ������ �̸��� list�� �ִ��� Ȯ���ϰ�, �� ����� ���� ��� �޼����� �ֿܼ� ����ϱ� ���� ����!!
								//������ �����Ѵٸ� boolean ���� true�� ������ ���� �� �����ߴٴ� �޼����� ��µǰԲ�!
		
		for(int i = 0; i<list.size(); i++) {
			Player player = list.get(i);
			if(name.equals(player.getName())) {
				list.remove(i);
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println(name + "���� �����߽��ϴ�.");
		} else {
			System.out.println(name + "���� ��ܿ� �����ϴ�.");
		}
	}
	
	public void allPlayer() { //�о�� ������ �ܼ�â�� ����Ϸ��� �޼���
		int num = 0;
//		Player player = new Player();
		if(list.size() == 0) {
			System.out.println("<��ϵ� ������ �����ϴ�.>");
		} else {
			System.out.println("\t<��ϵ� ���� �����Դϴ�!>");
			System.out.println("��ȣ\t������\t���ȣ\t������");
			System.out.println("=============================");
			for(Player p : list) {
			System.out.println(++num + "\t" + p.getName() + "\t" + p.getBackNumber() + "\t" + p.position);
			} //getter�� ����ϴ� ������ ���⼭ ����. ������ȭ�� ���� �����͸� list�� �޾ƿ԰�, list�� ���͸� ���� Player Ŭ������ ����� ���̱� ������ 
			  //�ܺ� Ŭ������ ������ ����� ���� ���������� getter�� �־���Ѵ�.
		}
	}
	
	
	public void objectOutputFile() { //Vector�� �߰��� list�� ����ȭ ���Ѽ� ������ ��η� �������� ���� �޼���
		FileOutputStream fos = null; //�� �ΰ��� �ִ��� �ٽ� �����ϱ�
		ObjectOutputStream oos = null; //��������
		
		try {
			fos = new FileOutputStream(FILENAME); //������ FILENAME���� �������Ŵ�.
			oos = new ObjectOutputStream(fos); //fos�� ����ȭ �ؼ� �������Ŵ�. (=FILENAME ��η� ������ ���� fos�� ����ȭ�ҰŴ�.)
			
			oos.writeObject(list); //����ȭ�� Object�� list!!!
			
		} catch (FileNotFoundException e) { //������ ������ ���µ� �������� �� �� ������ Exception
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
	
	public void objectInputFile() { //����ȭ�� ������ �ٽ� �б� ���� �޼��� = ������ȭ�� ���� �޼���
		FileInputStream fis = null; //�� null�� �ִ��� �ٽ� �����ϱ�
		ObjectInputStream ois = null; //��������
		
		try {
			fis = new FileInputStream(FILENAME); //FILENAME ��ο� �ִ� ������ �аڴ�.
			ois = new ObjectInputStream(fis); //fis�� ������ȭ�� �аڴ�.(���� ������)
//			list = ois.readObject(); //-->������ȭ�� �� �� ����ȭ�� ���� ���� Ÿ������??? ����ȯ�� ���־�� �Ѵ�. ���� �ڵ尡 �´��ڵ�
			list = (Vector<Player>)ois.readObject(); //ois�� ���ͷ� ����ȯ�� �ϰ� ���� �� ���� �����͸� list�� �ٽ� �־���!
													 //�� �о��� ���� ������ȭ �� list�� ��������� ����غ��� ��. allPlayer() �޼���� �о��!
			System.out.println("�� " + list.size() + "���� ���� ������ �ҷ��ɴϴ�.");
			
		} catch (FileNotFoundException e) { //���� ������ ���µ� �������� �� �� ������ Exception
			System.out.println("�ҷ��� ������ �����ϴ�." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //class������ ���� �� ������ �߻��ϴ� ������ ��!
			e.printStackTrace();
		} 
		
	}
	
	public void process() {
		while(true) {
			System.out.println("1.������� 2.�������� 3.��������Ʈ��� 4.���� �� ����");
			int n = Integer.parseInt(sc.nextLine());

			switch(n) {
			case 1:
				addPlayer();
				break;
			case 2:
				deletePlayer();
				break;
			case 3:
				allPlayer();
				break;
			case 4:
				objectOutputFile();
				System.out.println("����Ǿ����ϴ�. �����մϴ�");
				System.exit(0); //�� 0���� �ִ��� �����ϱ�!!
			default:
				System.out.println("1~4���� ������ �ּ���");
			}
		}
	}
	
	
	public static void main(String[] args) {
		MySerializable aa = new MySerializable();
	}

}
