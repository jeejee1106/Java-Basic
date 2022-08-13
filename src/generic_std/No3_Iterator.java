package generic_std;

import java.util.ArrayList;
import java.util.Iterator;

public class No3_Iterator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        /**
         * #1 Generic 사용 안했을 때
         */
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next(); //지네릭클래스를 사용하지 않으면 형변환 필요
            System.out.println(s.name);
        }

        /**
         * #2 Generic 사용 시
         */
        Iterator<Student> it2 = list.iterator();
        while (it2.hasNext()) {
            Student s = it2.next(); //형변환 생략 가능
            System.out.println(s.name);
            //위 두 줄의 코드는 아래 한줄의 코드로 작성 가능
            System.out.println(it2.next().name);
        }
    }
}

class Student {
    String name = "";
    int ban; //반
    int no; //번호

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
