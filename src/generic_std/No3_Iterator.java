package generic_std;

import java.util.ArrayList;
import java.util.Iterator;

public class No3_Iterator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("�ڹٿ�", 1, 1));
        list.add(new Student("�ڹ�¯", 1, 2));
        list.add(new Student("ȫ�浿", 2, 1));

        /**
         * #1 Generic ��� ������ ��
         */
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next(); //���׸�Ŭ������ ������� ������ ����ȯ �ʿ�
            System.out.println(s.name);
        }

        /**
         * #2 Generic ��� ��
         */
        Iterator<Student> it2 = list.iterator();
        while (it2.hasNext()) {
            Student s = it2.next(); //����ȯ ���� ����
            System.out.println(s.name);
            //�� �� ���� �ڵ�� �Ʒ� ������ �ڵ�� �ۼ� ����
            System.out.println(it2.next().name);
        }
    }
}

class Student {
    String name = "";
    int ban; //��
    int no; //��ȣ

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
