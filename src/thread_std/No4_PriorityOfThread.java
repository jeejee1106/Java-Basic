package thread_std;

public class No4_PriorityOfThread {
    /**
     * �������� �켱����
     * �ڹٿ����� �������� �켱������ ���� 1 ~ 10���� ������ �� �ִ�.
     * �۾��� �߿䵵�� ���� �������� �켱������ �ٸ��� �Ͽ� Ư�� �����尡 �� ���� �۾� �ð��� ���� �� �� �ִ�.
     * �߿䵵 ����  1 2 3 .. ... 8 9 10 �߿䵵 ����
     * but �߿䵵�� �츮�� ����������� ������ �׷��� ��������� �ʴ´�.
     * �츮�� �������� �켱������ �����ָ�, �����췯�� �װ��� ���� �� ������ ������ ������� �ʴ´٤̤�
     *
     * setPriority() : �������� �켱������ ����
     * getPriority() : �������� �켱���� ���������     */
    public static void main(String[] args) {
        Thread6 thread6 = new Thread6();
        Thread7 thread7 = new Thread7();

//        thread6.setPriority(5); //5�� �⺻ ������. ���� �������൵ �ȴ�.
        thread7.setPriority(7); //�ش� �������� �켱������ 7��!

        System.out.println("priority of thread6(-) : " + thread6.getPriority()); //5
        System.out.println("priority of thread7(|) : " + thread7.getPriority()); //7

        thread6.start();
        thread7.start();
    }
}

class Thread6 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int y = 0; y < 10000000; y++); //�ð����������� ������� �����ִ� for���� �������
        }
    }
}

class Thread7 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int y = 0; y < 10000000; y++); //�ð����������� ������� �����ִ� for���� �������
        }
    }
}
