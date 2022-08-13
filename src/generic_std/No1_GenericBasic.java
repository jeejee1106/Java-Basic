package generic_std;

import java.util.ArrayList;

public class No1_GenericBasic {
    /**
     * Generic Ŭ����?
     * : ������ �� Ÿ���� üũ�ִ� ���
     * : �Ϲ�Ŭ�������� ArrayList, HashMap ���� Ŭ�������� GenericŬ������ �ٲ����.
     */
    public static void main(String[] args) {
        /**
         * #1 Generic ��� ������ ��
         */
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30"); //String�� �߰�

        Integer a = (Integer)list.get(0); //list�� ��� Ÿ���� ObjectŸ���̱� ������ ����ȯ �ʼ�
        Integer b = (Integer)list.get(1);
        int aa = (int) list.get(0); //int�����ε� ����ȯ �����ϴ�.
//        Integer c = (Integer)list.get(2); //������ OK. but ��Ÿ�ӽ� ������ ����. ClassCastException

        // Generic Ŭ������ �̷��� ��Ÿ�ӿ����� ������ �� �� ����ֱ� ���� ��Ÿ����.
        // ���� �� ������ �߻��ϴ� �ͺ��� ������ �� �� ������ ���� �ؼ� ����ִ� ���� �����ϱ�!

        /**
         * #2 Generic ��� ��
         */
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(10);
        list2.add(20);
//        list2.add("30"); //�����Ͽ��� �߻�. Generic�� �������� Ÿ�԰� ��ġ���� ����!
        //�Ǽ��� �ٸ� ��ü�� ���� ������ �پ���.(Ÿ�Ծ�����)

        Integer a2 = list2.get(0); //����ȯ ��������(�ڵ� ����ȯ). �˸��� Ÿ���� �־���, �������� ���̱� ������.
        Integer b2 = list2.get(1); //������ �� �����Ϸ��� �ڵ� ����ȯ ����

        /**
         * #3 Generic�� Object
         */
        ArrayList<Object> list3 = new ArrayList<Object>();
        //�̷��� �����ָ� Generic�� ������� ���� ��(#1)�� �Ȱ��� ObjectŸ���� ��� ��ü�� �� �� �ִ�.
        //�׷� #1ó�� ������� �� <Object>�� �����ִ���??
        //�Ϲ����� ��! �̿��̸� Ÿ���� ��Ȯ�� ������ִ� ���� ���� ������!
        //������ ArrayList�� �ڵ带 ���� ������ ArrayList������(�Ϲ�Ŭ����) ����� ArrayList<E>��(���׸�Ŭ����) �����ִٴ� ���� �� �� �ִ�.
    }
}
