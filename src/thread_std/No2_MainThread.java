package thread_std;

public class No2_MainThread {

    /**
     * Thread�� ����
     * 1. ����� ������ (���� ������)
     * : ���ݱ����� main�޼��� �ϳ��� ����Ǵ� �̱۾����忴����, ��Ƽ�����带 �����ϸ� ���ξ����尡 ������ �����ȴ�.
     *   ���α׷��� ���ξ����尡 ��� ����Ǿ��� �� ���ᰡ �ȴ�.
     * <p>
     * 2. ���� ������ (���� ������)
     * : ���ξ����带 �����ִ� �������ε�, ������ ���� ���� ��!
     */

    static long startTime = 0;

    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        thread3.start();
        thread4.start();
        startTime = System.currentTimeMillis(); //1000���� 1�� : ���� �ֿܼ� 8�� �����ٸ� 0.008�� �ҿ�ƴ�.

        try {
            thread4.join();
            thread3.join();
            /**
             * join�޼���� main�޼��带 ���۽�Ű�� �����尡 thread3,4�� �۾��� ���� ������ ��ٸ��� ���ִ� �޼����̴�.
             * �� �ڵ带 �ּ�ó���ϸ� thread3,4�� �۾��� ������ ���� main�޼��带 ���۽�Ű�� ������ �۾��� ���� ������ �ҿ�ð��� �� ���� ������ �ȴ�.
             * ��, main�޼��尡 ���ᰡ �Ǿ, �ٸ� ���ξ�����(3,4)�� ������ ������ �ʾұ� ������ ���α׷��� ������� �ʴ´�!!!
             */
        } catch (InterruptedException e) {}

        System.out.println("�ҿ�ð� : " + (System.currentTimeMillis() - startTime));
    }

}

//java������ ��Ӱ� �������̽��� ���� ����� ������ �� �ִٸ� �������̽��� ���� ���� �� ȿ����������,
//���� ������ ������ �����ϱ� ����� ���� �����带 �����ߴ�.
//������ ������ ��Ʈ������ ThreadŬ������ ����ϴ� �����, Runnable�������̽��� �����ϴ� ����� �����ϰ��鼭 ����غ������Ѵ�!
class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("-");
        }
    }
}

class Thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("|");
        }
    }
}