package thread_std;

import javax.swing.*;

public class No3_IOBlocking_SingleThread {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
        System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
        /**
         * ���⼭ input���� �Է����� �ʰ� �����ְԵǸ�, �Ʒ��� �ڵ�� �������� ���ϰ� ��⸦ �ؾ��Ѵ�. -> IOBlocking
         */

        for (int i = 10; i > 0; i--) {

            System.out.println(i);
            try {
                Thread.sleep(1000); //1�ʰ� �ð��� �����Ѵ�.
            } catch (Exception e) {
            }
        }
    }
}
