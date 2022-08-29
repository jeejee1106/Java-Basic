package thread_std;

public class No6_ThreadBasic {

    /**
     * Thread 쓰레드 :
     * 쓰레드란 프로세스 안에서 일하는 일꾼과도 같다!
     * 프로세스 안에 쓰레드가 한 개면 싱글쓰레드, 두 개 이상이면 멀티쓰레드
     * 프로세스를 하나 더 만드는 것 보다, 프로세스 안에 쓰레드를 하나 더 만들어 주는 것이 효율적이다.
     *
     * 쓰레드를 사용하는 방법 :
     * 1. Thread클래스 상속받기
     * -> Thread클래스를 상속받아 run메서드로 쓰레드를 구현
     * 2. Runnable인터페이스 구현
     * -> Runnable인터페이스의 run메서드를 구현하여 쓰레드를 구현
     */

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        Runnable runnable = new Thread2();
        Thread thread2 = new Thread(runnable);

        //쓰레드의 실행 : 쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다.
        //두 개의 쓰레드 중 어떤 것이 먼저 실행될지는 모른다. OS의 스케쥴러가 결정! -> OS에 의존적이다.
        thread1.start(); //즉, 얘가 먼저 호출됐지만 먼저 실행되지는 않을 수도 있다!
        thread2.start(); //또한 이렇게 호출을 하면 쓰레드를 사용할 준비가 된것이지, 바로 사용되는 것은 아니다.
        //참고
        //우리는 run메서드를 만들었는데, 왜 start()를 호출할까??

        /**
         * 위 코드를 실행시켜보면, 먼저 호출된 thread1클래스가 500개가 다 돌고 thread2가 호출되는 것이 아니라,
         * thread1과 thread2가 번갈아가면서 호출되는 것을 볼 수 있다!!!!
         *
         * 이렇게 쓰레드로 구현하지 않고 각 쓰레드 클래스에 있는 기능들을 main메서드에 그대로 쓴다면 그것이 싱글쓰레드,
         * 지금의 이 코드가 멀티쓰레드라고 볼 수 있다!!!
         */

        //이렇게 하면 싱글쓰레드! 하나의 작업이 끝나야 그 다음 작업이 실행된다.
//        for (int i = 0; i < 500; i++) {
//            System.out.print(0); //조상인 Thread의 getName()을 호출.(this 생략가능)
//        }
//
//        for (int i = 0; i < 500; i++) {
//            System.out.print(1);
//        }
    }

}

//Thread클래스를 상속받아 run메서드로 쓰레드를 구현
class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(this.getName()); //조상인 Thread의 getName()을 호출.(this 생략가능)
        }
    }
}

//Runnable인터페이스의 run메서드를 구현하여 쓰레드를 구현
class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(Thread.currentThread().getName());
        }
    }
}