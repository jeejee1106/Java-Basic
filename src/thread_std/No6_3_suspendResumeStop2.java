package thread_std;

public class No6_3_suspendResumeStop2 {
    /**
     * deprecated�� �޼���� ��� ���� �� �޼��带 �����غ���!
     */
    public static void main(String[] args) {
        MyThread th1 = new MyThread("*");
        MyThread th2 = new MyThread("**");
        MyThread th3 = new MyThread("***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend(); //th1�� ��� �ߴܽ�Ų��.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume(); //th1�� �ٽ� �����ϵ��� �Ѵ�.
            Thread.sleep(3000);
            th1.stop(); //th1�� ���������Ų��.
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {
        }
    }
}

class MyThread implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    //volatile�� ���� ������ �����尡 ��� �������� ���·� ���´�.
    //volatile�̶�? '���� ���ϴ� ��' �̶�� ���̴�. ���� ���� �ٲ�� ���纻(?)���� ����(?)������ ������ ����� ��..?�̴�..?

    Thread th;

    MyThread(String name) {
        th = new Thread(this, name); //Thread(Runnable r, String name) �������� ��
    }
    void start() {
        th.start();
    }

    void stop() {
        stopped = true;
    }

    void suspend() {
        suspended = true;
    }

    void resume() {
        suspended = false;
    }

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //������� ��
                }
            }
        }
    }
}