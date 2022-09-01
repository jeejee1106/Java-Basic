package thread_std;

import javax.swing.*;

public class No3_IOBlocking_MultiThread {
    public static void main(String[] args) {
        Thread5 thread = new Thread5();
        thread.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + " 입니다.");
    }
}

/**
 * 멀티 쓰레드로 작업을 나눠 놓으면 input값을 입력하지 않아도 다른 작업이 실행된다.
 * 자원을 효율적으로 사용할 수 있다!
 */
class Thread5 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
            try {
                Thread.sleep(1000); //1초간 시간을 지연한다.
            } catch (Exception e) {
            }
        }
    }
}