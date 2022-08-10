package codingtest;
import java.util.ArrayList;
import java.util.Arrays;

class Opt3_Friends {
	public String solution(String[] friendsArr) {
		
		// 1. �̸��� �� ������ ģ���� ��� ���� �迭 ����
		ArrayList<String> list = new ArrayList<>();
		
		// 2. �̸��� ���̰� 4�� list�� �߰�
		for(String arrCheck : friendsArr) {
			if(arrCheck.length() == 4) {
				list.add(arrCheck);
			}
		}
		
		// 3. list�� ��� �迭�� �ٽ� String �迭�� ��Ƽ� return
		String[] newFriendsArr = new String[list.size()];
		for(int i = 0; i < newFriendsArr.length; i++ ) {
			newFriendsArr[i] = list.get(i);
		}
		
		return Arrays.toString(newFriendsArr);
	}
}