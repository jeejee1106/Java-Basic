package thread_std;

public class No5_DaemonThread implements Runnable {
    /**
     * 데몬쓰레드?
     * - 일반쓰레드의 작업을 돕는 보조적인 역할을 수행하는 쓰레드
     * - 일반쓰레드가 종료되면 보조할 일이 없기 때문에 자동적으로 종료된다.
     * - 가비지컬렉터, 자동저장, 화면 자동갱신 등에 사용된다. (즉, 보조작업)
     * - 사용법(작성법) : 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성!!
     * - 메서드 사용법 : void setDaemon(boolean on) - 쓰레드를 데몬쓰레드로 or 사용자 쓰레드로 변경. 매개변수 on을 true로 지정하면 데몬쓰레드가 된다.
     * - setDaemon(boolean on) 메서드는 반드시 start()메서드를 호출하기 전에 실행되어야한다. 그렇지 않으면 IllegalThreadStateException 발생!
     * - why? 일단 쓰레드가 실행 된 후에는 쓰레드의 종류를 변경할 수 없기 때문에 start()되기 전 메인으로 쓸건지 데몬으로 쓸건지 정해야한다.
     * - setDaemon()메서드를 사용하지 않으면 자동으로 일반(메인)쓰레드로 생성됨.
     */

    static boolean autoSave = false;

    public static void main(String[] args) {

//        Runnable runnable = new No5_DemonThread();
//        Thread thread = new Thread(runnable);
        //위 두줄을 아래 한줄로 선언 가능!! (기억 안나면 No1 보고 복습하자)
        Thread thread = new Thread(new No5_DaemonThread()); //Runnable 인터페이스를 구현한 쓰레드를 선언할 때 쓰는 방식 (기억 안나면 No1 보고 복습하자)
        thread.setDaemon(true); //thread를 데몬 쓰레드로 설정! 이 부분이 없으면 종료되지 않는다.
        thread.start(); //setDaemon()로 쓰레드의 종류를 정한 후 start() 해줌!

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); //1초
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if(i == 5) {
                autoSave = true;
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    //데몬쓰레드!
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); //3초마다 쓰레드를 쉬게 해준다.
            } catch (InterruptedException e) {
            }
            // autoSave의 값이 true이면 autoSave()를 호출한다.
            if(autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장 되었습니다");
    }
}
