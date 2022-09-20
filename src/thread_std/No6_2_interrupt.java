package thread_std;

import javax.swing.*;

public class No6_2_interrupt {
    /**
     * interrupt() : ������(waiting)�� �����带 ���������(runnable)�� �����.
     * - �������� ������? sleep(), join(), wait() ���
     * - interrupt() : �������� interrupted���¸� false���� true�� ����
     * - isInterrupted() : �ش� �����尡 ���ͷ�Ʈ �Ǿ��°�? (boolean)
     * - interrupted() : �ش� �����尡 ���ͷ�Ʈ �Ǿ��°�?(boolean)
     * �� �� �޼����� ������? interrupted()�� ����ƽ �޼����̴�. isInterrupted()�� ������ �޼��尡 ���ͷ�Ʈ �Ǿ����� Ȯ���Ѵٸ�,
     * interrupted() �޼���� main�޼��常 ���ͷ�Ʈ �Ǿ����� Ȯ�����ִ� �޼����̴�!!
     */
    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        thread10.start();
        System.out.println("isInterrupted() : " + thread10.isInterrupted()); //false
        String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
        System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
        thread10.interrupt(); //interrupt()�� ȣ���ϸ� interrupted���°� true�� �ȴ�.
        System.out.println("isInterrupted() : " + thread10.isInterrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //false
    }
}

class Thread10 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 2500000000L; x++); //�ð� ����
        }
        System.out.println("isInterrupted() : " + this.isInterrupted()); //true
        System.out.println("isInterrupted() : " + this.isInterrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //true
        System.out.println("interrupted() : " + Thread.interrupted()); //false -> isInterrupted()�� �޸� interrupted()�� interrupted��� ���º����� false�� �ʱ�ȭ�Ѵ�.
        System.out.println("Ű��Ʈ�� ����Ǿ����ϴ�.");
    }
}