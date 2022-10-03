package lambda_std;

public class No1_Lambda {
    /**
     * Lambda ���ٽ�
     * : �Լ�(�޼���)�� ������ ������ ǥ���� ��(�͸� ��ü)
     *
     * �ۼ����
     * 1. �޼����� �̸��� ��ȯŸ���� �����ϰ� '->' �� ��� {} �տ� �߰��Ѵ�.
     * 2. ��ȯ���� �ִ� ��� : ���̳� ���� ����  return���� ���� �����ϴ�. (���� ; �Ⱥ���)
     * 3. �Ű������� Ÿ���� �߷� �����ϴٸ� ���� ����(��κ��� ��� ���� ����)
     *
     * ���ǻ���
     * 1. �Ű������� �ϳ��� ���, () ���� ����(Ÿ���� ���� ����)
     * 2. ��� ���� ������ �ϳ����� �� {} ���� ����(���� ; �Ⱥ���). ��, �ϳ����� ������ return���̸� {} ���� �Ұ�
    */

    public static void main(String[] args) {
        //��� ���ٴ� �Ʒ��� ���� ������ �͸� ��ü�̴�.
//        Object obj = new Object(){
//            int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

//        MyFunction myFunction = new MyFunction(){
//            public int max(int a, int b) { //�������̵� ��Ģ���� ���� public�� ������Ѵ�.
//                return a > b ? a : b;
//            }
//        };
        //�� �ڵ带 ���ٽ�����!(���ٽ�(�͸� ��ü)�� �ٷ�� ���� ���������� Ÿ���� �Լ��� �������̽��� �Ѵ�.)
        MyFunction myFunction = (a, b) -> a > b ? a : b;

        int value = myFunction.max(3, 5); //�Լ��� �������̽�
        System.out.println("value = " + value);
    }
}

@FunctionalInterface //�Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ��������.
interface MyFunction {
    public abstract int max(int a, int b);
}
