package thread_std;

public class No6_4_join {
    /**
     * join() : 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.
     * - 예외처리를 해야한다. (InterruptedException이 발생하면 깨어나기 때문에) -> sleep() 메서드와 비슷
     */

    static long startTime = 0;

    public static void main(String[] args) {
        Thread12 thread12 = new Thread12();
        Thread13 thread13 = new Thread13();

        thread12.start();
        thread13.start();

        startTime = System.currentTimeMillis();

        //이 join메서드가 없으면 소요시간이 거의 바로 찍힌다. main쓰레드의 소요시간을 출력하는 것이기 때문에!!
        try {
            thread12.join(); //main쓰레드가 thread12의 작업이 끝날 때 까지 기다린다.
            thread13.join(); //main쓰레드가 thread13의 작업이 끝날 때 까지 기다린다.
        } catch (InterruptedException e) {
        }
        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
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