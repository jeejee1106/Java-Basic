package thread_std;

public class No6_3_suspendResumeStop2 {
    /**
     * deprecated된 메서드들 대신 직접 그 메서드를 구현해보자!
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

class MyThread implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;
    //volatile을 쓰지 않으면 쓰레드가 계속 실행중인 상태로 남는다.
    //volatile이란? '자주 변하는 값' 이라는 뜻이다. 값이 자주 바뀌는 복사본(?)보다 원본(?)변수를 가져다 쓰라는 뜻..?이다..?

    Thread th;

    MyThread(String name) {
        th = new Thread(this, name); //Thread(Runnable r, String name) 구현해준 것
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
                    //비워놔도 됌
                }
            }
        }
    }
}