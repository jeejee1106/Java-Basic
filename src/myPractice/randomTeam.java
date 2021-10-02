package myPractice;

public class randomTeam {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		
		for(int i = 0; i<arr.length; i++) {
			int ran = (int)(Math.random()*6+1);			
			System.out.println(arr[i] +"님은 " + ran + "조 입니다.");
			
		}
	}

}
