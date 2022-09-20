package thread_std;

import javax.swing.*;

public class No6_3_suspendResumeStop {
    /**
     * suspend() : 쓰레드를 일시정지 시킨다.
     * resume() : suspend()에 의해 일시정지된 쓰레드를 실행대기상태로 만든다.
     * stop() : 쓰레드를 즉시 종료시킨다.
     * 위 세 메서드들은 deprecated됐다. 되도록 쓰지말 것!! 알아만두자.
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
            th1.suspend(); //th1을 잠시 중단시킨다.
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume(); //th1이 다시 동작하도록 한다.
            Thread.sleep(3000);
            th1.stop(); //th1을 강제종료시킨다.
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