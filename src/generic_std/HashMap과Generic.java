package generic_std;

import java.util.HashMap;

public class HashMap과Generic {
    public static void main(String[] args) {
        // 제네릭클래스 사용안함
        HashMap map = new HashMap(); //지네릭을 사용하지 않으면 모든 객체(Object)가 들어갈 수 있다.
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
        Student s = (Student) map.get("자바왕"); //형변환이 필요하다.
        System.out.println(map);

        // 제네릭클래스 사용
        HashMap<String, Student> map2 = new HashMap<>(); //jdk1.7부터 생성자의 타입 지정 생략 가능
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
        Student s2 = map2.get("자바왕");
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