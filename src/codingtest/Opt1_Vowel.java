package codingtest;
class Opt1_Vowel {
	public int solution(String str) {
		int count = 0;
		String[] vowel = {"a", "e", "i", "o", "u"}; //���� �迭 ����
		String[] strArr = str.split(""); //�Ķ���ͷ� ���� ���ڿ��� �и��ؼ� �迭�� �ֱ�

		// 1. �� �迭�� ���ؼ� ���� �����Ͱ� ������ count�� 1�� �����ش�.
		for(String checkStr : strArr) {
			for(String checkVowel : vowel) {
				if(checkStr.equals(checkVowel)) {
					count++;
				}
			}
		}
		
		return count;
	}
}