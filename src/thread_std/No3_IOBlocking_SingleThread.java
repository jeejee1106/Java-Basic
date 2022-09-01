package thread_std;

import javax.swing.*;

public class No3_IOBlocking_SingleThread {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + " 입니다.");
        /**
         * 여기서 input값을 입력하지 않고 멈춰있게되면, 아래의 코드는 동작하지 못하고 대기를 해야한다. -> IOBlocking
         */

        for (int i = 10; i > 0; i--) {

            System.out.println(i);
            try {
                Thread.sleep(1000); //1초간 시간을 지연한다.
            } catch (Exception e) {
            }
        }
    }
}
