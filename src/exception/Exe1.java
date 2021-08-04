package exception;

public class Exe1 {

	public static void main(String[] args) {
		
		String arr[] = {"10", "2a"};
		int value = 0;
		
		for(int i = 0; i<=arr.length; i++) {
			try {
			value = Integer.parseInt(arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
		
		
	}

}
/*
 * Q. 위 코드의 출력값은????
 * A. 10
 *    숫자로 변환할 수 없음
 *    10
 *    인덱스를 초과했음
 *    10
 * */