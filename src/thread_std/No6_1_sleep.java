package thread_std;

public class No6_1_sleep {
    /**
     * sleep() : ���� �����带 ������ �ð����� ���߰� �Ѵ�.
     * - ����ó���� �ؾ��Ѵ�. (InterruptedException�� �߻��ϸ� ����� ������)
     * - ������ �ڱ� �ڽſ��� ����Ǵ� �޼����̱� ������ �ٸ� Ư�� �����带 �����ؼ� ���߰� �ϴ� ���� �Ұ����ϴ�.
     */
    public static void main(String[] args) {
        Thread8 thread8 = new Thread8();
        Thread9 thread9 = new Thread9();

        thread8.start();
        thread9.start();

        //�Ʒ� �ڵ带 �޼���� ������ֱ�!!
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            //�ƹ� �ڵ嵵 ��� ��. ������ ���� try-catch�� ������ �ƴϱ� ������
//        }
        delay(2000); // -> �ּ� �ɰ� Ǯ�鼭 sleep�޼��尡 �ְ� ������ ���� ���ϱ�
        System.out.println("<<main ����>>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000); //main�����尡 ���� ��� ����
        } catch (InterruptedException e) {
            //�ƹ� �ڵ嵵 ��� ��. ������ ���� try-catch�� ������ �ƴϱ� ������
        }
    }
}

class Thread8 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.println("<<thread8 ����>>");
    }
}

class Thread9 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("<<thread9 ����>>");
    }
}
