package thread_std;

import javax.swing.*;

public class No6_2_interrupt {
    /**
     * interrupt() : 대기상태(waiting)인 쓰레드를 실행대기상태(runnable)로 만든다.
     * - 대기상태인 쓰레드? sleep(), join(), wait() 등등
     * - interrupt() : 쓰레드의 interrupted상태를 false에서 true로 변경
     * - isInterrupted() : 해당 쓰레드가 인터럽트 되었는가? (boolean)
     * - interrupted() : 해당 쓰레드가 인터럽트 되었는가?(boolean)
     * 위 두 메서드의 차이점? interrupted()는 스태틱 메서드이다. isInterrupted()는 지정한 메서드가 인터럽트 되었는지 확인한다면,
     * interrupted() 메서드는 main메서드만 인터럽트 되었는지 확인해주는 메서드이다!!
     */
    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        thread10.start();
        System.out.println("isInterrupted() : " + thread10.isInterrupted()); //false
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은 " + input + "입니다.");
        thread10.interrupt(); //interrupt()를 호출하면 interrupted상태가 true가 된다.
        System.out.println("isInterrupted() : " + thread10.isInterrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //false
    }
}

class Thread10 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++); //시간 지연
        }
        System.out.println("isInterrupted() : " + this.isInterrupted()); //true
        System.out.println("isInterrupted() : " + this.isInterrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //false -> isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 false로 초기화한다.
        System.out.println("키운트가 종료되었습니다.");
    }
}