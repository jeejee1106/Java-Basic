package thread_std;

import javax.swing.*;

public class No3_IOBlocking_MultiThread {
    public static void main(String[] args) {
        Thread5 thread = new Thread5();
        thread.start();

        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
        System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
    }
}

/**
 * ��Ƽ ������� �۾��� ���� ������ input���� �Է����� �ʾƵ� �ٸ� �۾��� ����ȴ�.
 * �ڿ��� ȿ�������� ����� �� �ִ�!
 */
class Thread5 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {

            System.out.println(i);
            try {
                Thread.sleep(1000); //1�ʰ� �ð��� �����Ѵ�.
            } catch (Exception e) {
            }
        }
    }
}