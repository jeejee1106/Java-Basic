package generic_std;

import java.util.ArrayList;

class Tv {}
class Audio {}

public class Ÿ�Ժ��� {
    /**
     * Ÿ�� ���� : ���׸�Ŭ������ ���� Ÿ���� ���� E, Y, EE���� ������ �����ϴ� ��
     * ��ü�� ������ �� Ÿ�Ժ��� ��� ���� Ÿ���� �����ؾ��Ѵ�.
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
    }
}
