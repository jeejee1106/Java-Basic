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
	Vector<Player> list = new Vector<Player>(); //Player class를   Vector에 저장
	Scanner sc = new Scanner(System.in);
	
	public MySerializable() { //default 생성자. 여기에 파일을 읽는 메서드를 호출한다. 실행시키자마자 파일을 읽기 위해!
		objectInputFile();
		process(); //이 두개의 메서드는 메인메서드에서 객체를 생성한 후 거기서 호출해줘도 됨!!!
	}
	
	public void addPlayer() {
		System.out.println("등록할 선수명을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("등번호를 입력해주세요.");
		int backNumber = Integer.parseInt(sc.nextLine());
		System.out.println("포지션을 입력해주세요");
		String position = sc.nextLine();
		
		Player player = new Player(name, backNumber, position); //스캐너로 받은 이름,등번호,포지션을 player객체에 담고
		list.add(player); //player객체를 list에 추가한다.
		
		System.out.println("선수등록이 완료되었습니다.");
	}
	
	public void deletePlayer() {
		System.out.println("삭제할 선수명을 입력해주세요");
		String name = sc.nextLine();
		
		boolean result = false; //for문을 통해 삭제할 이름이 list에 있는지 확인하고, 그 결과에 따른 결과 메세지를 콘솔에 출력하기 위해 쓰임!!
								//삭제에 성공한다면 boolean 값을 true로 재정의 해준 후 삭제했다는 메세지가 출력되게끔!
		
		for(int i = 0; i<list.size(); i++) {
			Player player = list.get(i);
			if(name.equals(player.getName())) {
				list.remove(i);
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println(name + "님을 삭제했습니다.");
		} else {
			System.out.println(name + "님은 명단에 없습니다.");
		}
	}
	
	public void allPlayer() { //읽어온 파일을 콘솔창에 출력하려는 메서드
		int num = 0;
//		Player player = new Player();
		if(list.size() == 0) {
			System.out.println("<등록된 선수가 없습니다.>");
		} else {
			System.out.println("\t<등록된 선수 정보입니다!>");
			System.out.println("번호\t선수명\t등번호\t포지션");
			System.out.println("=============================");
			for(Player p : list) {
			System.out.println(++num + "\t" + p.getName() + "\t" + p.getBackNumber() + "\t" + p.position);
			} //getter를 써야하는 이유가 여기서 나옴. 역직렬화를 통해 데이터를 list로 받아왔고, list는 벡터를 통해 Player 클래스에 저장된 값이기 떄문에 
			  //외부 클래스의 변수에 저장된 값을 가져오려면 getter가 있어야한다.
		}
	}
	
	
	public void objectOutputFile() { //Vector에 추가한 list를 직렬화 시켜서 지정된 경로로 내보내기 위한 메서드
		FileOutputStream fos = null; //왜 널값을 주는지 다시 공부하기
		ObjectOutputStream oos = null; //마찬가지
		
		try {
			fos = new FileOutputStream(FILENAME); //파일을 FILENAME으로 내보낼거다.
			oos = new ObjectOutputStream(fos); //fos를 직렬화 해서 내보낼거다. (=FILENAME 경로로 내보낼 파일 fos를 직렬화할거다.)
			
			oos.writeObject(list); //직렬화할 Object는 list!!!
			
		} catch (FileNotFoundException e) { //내보낼 파일이 없는데 내보려고 할 때 나오는 Exception
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
	
	public void objectInputFile() { //직렬화된 파일을 다시 읽기 위한 메서드 = 역직렬화를 위한 메서드
		FileInputStream fis = null; //왜 null을 주는지 다시 공부하기
		ObjectInputStream ois = null; //마찬가지
		
		try {
			fis = new FileInputStream(FILENAME); //FILENAME 경로에 있는 파일을 읽겠다.
			ois = new ObjectInputStream(fis); //fis를 역직렬화로 읽겠다.(아직 안읽음)
//			list = ois.readObject(); //-->역직렬화를 할 땐 직렬화를 했을 때의 타입으로??? 형변환을 해주어야 한다. 밑의 코드가 맞는코드
			list = (Vector<Player>)ois.readObject(); //ois를 벡터로 형변환을 하고 읽은 뒤 읽은 데이터를 list에 다시 넣어줌!
													 //다 읽었음 이제 역직렬화 된 list를 보고싶으면 출력해보면 됨. allPlayer() 메서드로 읽어보장!
			System.out.println("총 " + list.size() + "명의 선수 정보를 불러옵니다.");
			
		} catch (FileNotFoundException e) { //읽을 파일이 없는데 읽으려고 할 때 나오는 Exception
			System.out.println("불러올 정보가 없습니다." + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //class파일이 없을 수 있으니 발생하는 예외인 듯!
			e.printStackTrace();
		} 
		
	}
	
	public void process() {
		while(true) {
			System.out.println("1.선수등록 2.선수삭제 3.선수리스트출력 4.종료 및 저장");
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
				System.out.println("저장되었습니다. 종료합니다");
				System.exit(0); //왜 0으로 주는지 공부하기!!
			default:
				System.out.println("1~4번중 선택해 주세요");
			}
		}
	}
	
	
	public static void main(String[] args) {
		MySerializable aa = new MySerializable();
	}

}
