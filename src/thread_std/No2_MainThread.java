package thread_std;

public class No2_MainThread {

    /**
     * Thread의 종류
     * 1. 사용자 쓰레드 (메인 쓰레드)
     * : 지금까지는 main메서드 하나만 실행되는 싱글쓰레드였지만, 멀티쓰레드를 구현하면 메인쓰레드가 여러개 생성된다.
     *   프로그램은 메인쓰레드가 모두 종료되었을 때 종료가 된다.
     * <p>
     * 2. 데몬 쓰레드 (보조 쓰레드)
     * : 메인쓰레드를 도와주는 쓰레드인데, 아직은 깊이 몰라도 됌!
     */

    static long startTime = 0;

    public static void main(String[] args) {
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        thread3.start();
        thread4.start();
        startTime = System.currentTimeMillis(); //1000분의 1초 : 만약 콘솔에 8이 찍혔다면 0.008초 소요됐다.

        try {
            thread4.join();
            thread3.join();
            /**
             * join메서드는 main메서드를 동작시키는 쓰레드가 thread3,4의 작업이 끝날 때까지 기다리게 해주는 메서드이다.
             * 위 코드를 주석처리하면 thread3,4의 작업이 끝나기 전에 main메서드를 동작시키는 쓰레드 작업이 먼저 끝나서 소요시간이 맨 위에 찍히게 된다.
             * 즉, main메서드가 종료가 되어도, 다른 메인쓰레드(3,4)의 동작이 끝나지 않았기 때문에 프로그램은 종료되지 않는다!!!
             */
        } catch (InterruptedException e) {}

        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
    }

}

//java에서는 상속과 인터페이스로 같은 기능을 구현할 수 있다면 인터페이스를 쓰는 것이 더 효율적이지만,
//지금 예제는 간단한 예제니까 상속을 통해 쓰레드를 구현했다.
//앞으로 쓰레드 파트에서는 Thread클래스를 상속하는 방법과, Runnable인터페이스를 구현하는 방법을 번갈하가면서 사용해보려고한다!
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