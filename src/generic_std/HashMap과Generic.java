package generic_std;

import java.util.HashMap;

public class HashMap��Generic {
    public static void main(String[] args) {
        // ���׸�Ŭ���� ������
        HashMap map = new HashMap(); //���׸��� ������� ������ ��� ��ü(Object)�� �� �� �ִ�.
        map.put("�ڹٿ�", new Student("�ڹٿ�", 1, 1, 100, 100, 100));
        Student s = (Student) map.get("�ڹٿ�"); //����ȯ�� �ʿ��ϴ�.
        System.out.println(map);

        // ���׸�Ŭ���� ���
        HashMap<String, Student> map2 = new HashMap<>(); //jdk1.7���� �������� Ÿ�� ���� ���� ����
        map.put("�ڹٿ�", new Student("�ڹٿ�", 1, 1, 100, 100, 100));
        Student s2 = map2.get("�ڹٿ�");
        System.out.println(map2);

    }
}

class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}