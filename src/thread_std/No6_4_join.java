package thread_std;

public class No6_4_join {
    /**
     * join() : ������ �ð����� Ư�� �����尡 �۾��ϴ� ���� ��ٸ���.
     * - ����ó���� �ؾ��Ѵ�. (InterruptedException�� �߻��ϸ� ����� ������) -> sleep() �޼���� ���
     */

    static long startTime = 0;

    public static void main(String[] args) {
        Thread12 thread12 = new Thread12();
        Thread13 thread13 = new Thread13();

        thread12.start();
        thread13.start();

        startTime = System.currentTimeMillis();

        //�� join�޼��尡 ������ �ҿ�ð��� ���� �ٷ� ������. main�������� �ҿ�ð��� ����ϴ� ���̱� ������!!
        try {
            thread12.join(); //main�����尡 thread12�� �۾��� ���� �� ���� ��ٸ���.
            thread13.join(); //main�����尡 thread13�� �۾��� ���� �� ���� ��ٸ���.
        } catch (InterruptedException e) {
        }
        System.out.println("�ҿ�ð� : " + (System.currentTimeMillis() - startTime));
    }
}

class Thread12 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class Thread13 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}