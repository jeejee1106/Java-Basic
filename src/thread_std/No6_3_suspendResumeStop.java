package thread_std;

import javax.swing.*;

public class No6_3_suspendResumeStop {
    /**
     * suspend() : �����带 �Ͻ����� ��Ų��.
     * resume() : suspend()�� ���� �Ͻ������� �����带 ��������·� �����.
     * stop() : �����带 ��� �����Ų��.
     * �� �� �޼������ deprecated�ƴ�. �ǵ��� ������ ��!! �˾Ƹ�����.
     */
    public static void main(String[] args) {
        Thread11 thread11 = new Thread11();
        Thread th1 = new Thread(thread11, "*");
        Thread th2 = new Thread(thread11, "**");
        Thread th3 = new Thread(thread11, "***");

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

class Thread11 implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}