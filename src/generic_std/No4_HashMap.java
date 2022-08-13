package generic_std;

import java.util.HashMap;

public class No4_HashMap {
    /**
     * HashMap은 타입변수가 두 개
     * HashMap<K, V>
     */
    public static void main(String[] args) {
        /**
         * #1 Generic 사용 안했을 때
         */
        HashMap map = new HashMap(); //지네릭을 사용하지 않으면 모든 객체(Object)가 들어갈 수 있다.
        map.put("자바왕", new Student2("자바왕", 1, 1, 100, 100, 100));
        Student s = (Student) map.get("자바왕"); //형변환이 필요하다.
        System.out.println(map);

        /**
         * #2 Generic 사용 시
         */
        HashMap<String, Student2> map2 = new HashMap<>(); //jdk1.7부터 생성자의 타입 지정 생략 가능
        map.put("자바왕", new Student2("자바왕", 1, 1, 100, 100, 100));
        Student2 s2 = map2.get("자바왕"); //형변환 생략 가능
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