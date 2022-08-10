package oop_std.method_std;

public class Ex6_1 {

    public static void main(String[] args) {

        Tv t = new Tv();

        t.channelUp();

        System.out.println("현재 채널은 " + t.channel + "입니다.");

        t.channelDown();
        t.channelDown();

        System.out.println("현재 채널은 " + t.channel + "입니다.");
        System.out.println("tv의 너비는 " + Tv.width + "입니다."); //ClassVariable은 객체 생성 없이 사용 가능
        System.out.println("tv의 너비는 " + t.width + "입니다.");
    }
}

class Tv {

    //tv의 속성(멤버 변수)
    String color;
    boolean power;
    int channel;
    static int width = 500;

    //tv의 기능 (메서드)
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}