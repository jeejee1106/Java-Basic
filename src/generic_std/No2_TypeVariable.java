package generic_std;

import java.util.ArrayList;

class Tv extends Product{}
class Audio extends Product{}
class Product{}

public class No2_TypeVariable {
    /**
     * Ÿ�� ���� : ���׸�Ŭ����(List, Map ��)�� �ۼ��� ��, ObjectŸ���� E, Y, EE���� ������ �����ϴ� ��
     * but, ��ü�� ������ �ÿ��� Ÿ�Ժ��� ��� ���� Ÿ���� �����ؾ��Ѵ�.
     *
     * �������
     * 1. static�ʵ忡 Ÿ�Ժ��� ��� �Ұ�
     * 2. �迭, ��ü�迭�� ������ �� Ÿ�Ժ��� ��� �Ұ�. but Ÿ�Ժ����� �迭 ������ ����
     */
    public static void main(String[] args) {
        //���׸� Ŭ������ ����ϱ� ��
        //list�� ��� Ÿ����(Object) ��ü�� ���� �� �־ �߸��� ��ü�� �� ������ ũ��.
        ArrayList list = new ArrayList();
        list.add(new Tv());
        list.add(new Audio());
        Tv t1 = (Tv)list.get(0); //ObjectŸ������ ���� ������ ���� �� ����ȯ�� ������Ѵ�.

        //���׸� Ŭ���� ��� #1
        //<Tv>�κ��� Ÿ�Ժ��� �κ�. ����� �� �̷��� ���� ��ü�� �־��־���Ѵ�.
        ArrayList<Tv> list2 = new ArrayList<Tv>(); //���� ��� Ÿ���� ���� �� ���� Tv��ü�� list�� ��� �� �ְ� �Ǿ���.
        list2.add(new Tv());
//        list2.add(new Audio()); //����. ������ TvŸ�Ը� ���� �� �ִ�.
        Tv t2 = list2.get(0); //ó������ TvŸ�Ը� �޾ұ� ������ ���� �� ����ȯ�� ������ �ʾƵ� �ȴ�.

        //���׸� Ŭ���� ��� #2
//        ArrayList<Object> list3 = new ArrayList<Tv>(); //����
        //���������� ���Ե� Ÿ�԰� �����ڿ� ���Ե� Ÿ���� ���ƾ��Ѵ�.
        //Ÿ���� �ٸ� ��쵵 �ֱ� ������ �⺻�����δ� ���ƾ��Ѵ�.

        //���׸� Ŭ���� ��� #3
        //�Ű������� �������� ����
        ArrayList<Product> list4 = new ArrayList<Product>(); //������ ���������� ���Ե� Ÿ�԰� �����ڿ� ���Ե� Ÿ���� ���ƾ� ������,
//        ArrayList<Product> list4 = new ArrayList<Tv>(); //����(Ÿ�� ����ġ - ��������,�����ڰ��� Ÿ����ġ ���� ��Ӱ��赵 ������� ����.)
        list4.add(new Product()); // �޼����� �Ű������� �������� �����Ѵ�.
        list4.add(new Tv()); //TvŬ������ Product�� ��ӹ޾ұ� ������ ��밡��.
        list4.add(new Audio()); //��������
    }


    class Box<T> {
        //���׸� Ŭ������ ������� #1
//        static T item; //����
//        static int compare(T t1, T t2) {return 0;} //����

        //���׸� Ŭ������ ������� #2
        T[] itemArr; //Ok ��ü�迭 '����'!

//        T[] toArray() {
//            T[] tmpArr = new T[itemArr.length]; //����. ���׸� �迭 '����' �Ұ�.
//        }

   }
}
