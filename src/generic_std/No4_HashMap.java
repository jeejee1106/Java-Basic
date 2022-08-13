package generic_std;

import java.util.HashMap;

public class No4_HashMap {
    /**
     * HashMap�� Ÿ�Ժ����� �� ��
     * HashMap<K, V>
     */
    public static void main(String[] args) {
        /**
         * #1 Generic ��� ������ ��
         */
        HashMap map = new HashMap(); //���׸��� ������� ������ ��� ��ü(Object)�� �� �� �ִ�.
        map.put("�ڹٿ�", new Student2("�ڹٿ�", 1, 1, 100, 100, 100));
        Student s = (Student) map.get("�ڹٿ�"); //����ȯ�� �ʿ��ϴ�.
        System.out.println(map);

        /**
         * #2 Generic ��� ��
         */
        HashMap<String, Student2> map2 = new HashMap<>(); //jdk1.7���� �������� Ÿ�� ���� ���� ����
        map.put("�ڹٿ�", new Student2("�ڹٿ�", 1, 1, 100, 100, 100));
        Student2 s2 = map2.get("�ڹٿ�"); //����ȯ ���� ����
        System.out.println(map2);

    }
}

class Student2 {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}