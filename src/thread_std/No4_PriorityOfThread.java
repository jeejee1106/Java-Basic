package thread_std;

public class No4_PriorityOfThread {
    /**
     * 쓰레드의 우선순위
     * 자바에서는 쓰레드의 우선순위를 숫자 1 ~ 10까지 지정할 수 있다.
     * 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업 시간을 갖게 할 수 있다.
     * 중요도 낮음  1 2 3 .. ... 8 9 10 중요도 높음
     * but 중요도는 우리의 희망사항이지 무조건 그렇게 실행되지는 않는다.
     * 우리가 쓰레드의 우선순위를 정해주면, 스케쥴러는 그것을 참고만 할 뿐이지 무조건 들어주지 않는다ㅜㅜ
     *
     * setPriority() : 쓰레드의 우선순위를 지정
     * getPriority() : 쓰레드의 우선순위 가져오기기     */
    public static void main(String[] args) {
        Thread6 thread6 = new Thread6();
        Thread7 thread7 = new Thread7();

//        thread6.setPriority(5); //5가 기본 설정임. 굳이 안적어줘도 된다.
        thread7.setPriority(7); //해당 쓰레드의 우선순위는 7번!

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
            for (int y = 0; y < 10000000; y++); //시간지연용으로 헛바퀴만 돌고있는 for문을 만들어줌
        }
    }
}

class Thread7 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int y = 0; y < 10000000; y++); //시간지연용으로 헛바퀴만 돌고있는 for문을 만들어줌
        }
    }
}
