package oop_std.method_std;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 채널은" + t1.channel + "입니다."); //0
        System.out.println("t2의 채널은" + t2.channel + "입니다."); //0

        t1.channel = 7;
        t2.channel = 7;

        t1.channelDown();
        t2.channelUp();

        System.out.println("t1의 채널은" + t1.channel + "입니다."); //6
        System.out.println("t2의 채널은" + t2.channel + "입니다."); //8

        t1.channelDown();
        t2 = t1;

        System.out.println("t1의 채널은" + t1.channel + "입니다."); //5
        System.out.println("t2의 채널은" + t2.channel + "입니다."); //5
    }
}
