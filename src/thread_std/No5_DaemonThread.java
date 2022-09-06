package thread_std;

public class No5_DaemonThread implements Runnable {
    /**
     * ���󾲷���?
     * - �Ϲݾ������� �۾��� ���� �������� ������ �����ϴ� ������
     * - �Ϲݾ����尡 ����Ǹ� ������ ���� ���� ������ �ڵ������� ����ȴ�.
     * - �������÷���, �ڵ�����, ȭ�� �ڵ����� � ���ȴ�. (��, �����۾�)
     * - ����(�ۼ���) : ���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϴٰ� Ư�������� �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ�!!
     * - �޼��� ���� : void setDaemon(boolean on) - �����带 ���󾲷���� or ����� ������� ����. �Ű����� on�� true�� �����ϸ� ���󾲷��尡 �ȴ�.
     * - setDaemon(boolean on) �޼���� �ݵ�� start()�޼��带 ȣ���ϱ� ���� ����Ǿ���Ѵ�. �׷��� ������ IllegalThreadStateException �߻�!
     * - why? �ϴ� �����尡 ���� �� �Ŀ��� �������� ������ ������ �� ���� ������ start()�Ǳ� �� �������� ������ �������� ������ ���ؾ��Ѵ�.
     * - setDaemon()�޼��带 ������� ������ �ڵ����� �Ϲ�(����)������� ������.
     */

    static boolean autoSave = false;

    public static void main(String[] args) {

//        Runnable runnable = new No5_DemonThread();
//        Thread thread = new Thread(runnable);
        //�� ������ �Ʒ� ���ٷ� ���� ����!! (��� �ȳ��� No1 ���� ��������)
        Thread thread = new Thread(new No5_DaemonThread()); //Runnable �������̽��� ������ �����带 ������ �� ���� ��� (��� �ȳ��� No1 ���� ��������)
        thread.setDaemon(true); //thread�� ���� ������� ����! �� �κ��� ������ ������� �ʴ´�.
        thread.start(); //setDaemon()�� �������� ������ ���� �� start() ����!

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); //1��
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if(i == 5) {
                autoSave = true;
            }
        }
        System.out.println("���α׷��� �����մϴ�.");
    }

    //���󾲷���!
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); //3�ʸ��� �����带 ���� ���ش�.
            } catch (InterruptedException e) {
            }
            // autoSave�� ���� true�̸� autoSave()�� ȣ���Ѵ�.
            if(autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("�۾������� �ڵ����� �Ǿ����ϴ�");
    }
}
