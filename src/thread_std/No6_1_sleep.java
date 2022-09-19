package thread_std;

public class No6_1_sleep {
    /**
     * sleep() : 현재 쓰레드를 지정된 시간동안 멈추게 한다.
     * - 예외처리를 해야한다. (InterruptedException이 발생하면 깨어나기 때문에)
     * - 쓰레드 자기 자신에게 적용되는 메서드이기 때문에 다른 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다.
     */
    public static void main(String[] args) {
        Thread8 thread8 = new Thread8();
        Thread9 thread9 = new Thread9();

        thread8.start();
        thread9.start();

        //아래 코드를 메서드로 만들어주기!!
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            //아무 코드도 없어도 됨. 에러가 나서 try-catch를 넣은게 아니기 때문에
//        }
        delay(2000); // -> 주석 걸고 풀면서 sleep메서드가 있고 없고의 차이 비교하기
        System.out.println("<<main 종료>>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000); //main쓰레드가 잠이 드는 거임
        } catch (InterruptedException e) {
            //아무 코드도 없어도 됨. 에러가 나서 try-catch를 넣은게 아니기 때문에
        }
    }
}

class Thread8 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.println("<<thread8 종료>>");
    }
}

class Thread9 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("<<thread9 종료>>");
    }
}
