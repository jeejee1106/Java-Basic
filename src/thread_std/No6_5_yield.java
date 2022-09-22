package thread_std;

public class No6_5_yield {
    /**
     * yield() : ���� ������ �ð��� ���� �����忡�� �纸�ϰ�, �ڽ�(���� ������)�� �������Ѵ�.
     * - yield()�� interrupt()�� ������ ����ϸ�, ���伺�� ȿ���� ���� �� �ִ�.
     */

    public static void main(String[] args) {
        MyThread2 th1 = new MyThread2("*");
        MyThread2 th2 = new MyThread2("**");
        MyThread2 th3 = new MyThread2("***");

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

class MyThread2 implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    //volatile�� ���� ������ �����尡 ��� �������� ���·� ���´�.
    //volatile�̶�? '���� ���ϴ� ��' �̶�� ���̴�. ���� ���� �ٲ�� ���纻(?)���� ����(?)������ ������ ����� ��..?�̴�..?

    Thread th;

    MyThread2(String name) {
        th = new Thread(this, name); //Thread(Runnable r, String name) �������� ��
    }
    void start() {
        th.start();
    }

    void resume() {
        suspended = false;
    }

    void suspend() {
        suspended = true;
        th.interrupt();
    }

    void stop() {
        stopped = true;
        th.interrupt();
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
            } else {
                Thread.yield(); //�纸 -> OS�����췯���� �纸�Ұ��̶�� �뺸
            }
        }
    }
}