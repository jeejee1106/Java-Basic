package exception;

public class Exe1 {

	public static void main(String[] args) {
		
		String arr[] = {"10", "2a"};
		int value = 0;
		
		for(int i = 0; i<=arr.length; i++) {
			try {
			value = Integer.parseInt(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
			}catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			}finally {
				System.out.println(value);
			}
		}
		
		
	}

}
/*
 * Q. �� �ڵ��� ��°���????
 * A. 10
 *    ���ڷ� ��ȯ�� �� ����
 *    10
 *    �ε����� �ʰ�����
 *    10
 * */