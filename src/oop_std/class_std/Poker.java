package oop_std.class_std;

public class Poker {
    public static void main(String[] args) {

        System.out.println("card1의 너비는 " + Card.width + "이며, 높이는 " + Card.height + "입니다."); //클래스변수는 객체 생성 없이도 사용 가능
        System.out.println("card2의 너비는 " + Card.width + "이며, 높이는 " + Card.height + "입니다.");

        Card card1 = new Card();
        card1.shape = "heart";
        card1.number = 7;

        Card card2 = new Card();
        card2.shape = "space";
        card2.number = 2;

        Print print = new Print();
        print.Card1();
        print.Card2();

        //class변수는 참조변수가 아닌 객체이름(클래스명)으로 써주는 것이 좋다.
        Card.width = 150;
        //참조변수로 호출해도 이상은 없지만, 사실 이건 공통 속성을 바꿔주는 코드인데 card1의 속성만 바꾸는 것으로 착각할 수 있기 때문이다.
        card1.height = 350;

        print.Card1();
        print.Card2(); //card2의 height는 바꾼적이 없는데 350으로 바뀐 것을 볼 수 있다. 사실 위에서 바꿔준 height가 class변수이기 때문이다.
    }
}

class Card {
    static int width = 100;
    static int height = 300;
    String shape;
    int number;
}

class Print {
    Card card1 = new Card();
    Card card2 = new Card();

    void Card1() {
        System.out.println("car1의 모양은 " + card1.shape + "이고, 숫자는 " + card1.number + "입니다."
                + "너비는 " + Card.width + "이며, 높이는 " + Card.height + "입니다.");
    }

    void Card2() {
        System.out.println("car2의 모양은 " + card2.shape + "이고, 숫자는 " + card2.number + "입니다."
                + "너비는 " + Card.width + "이며, 높이는 " + Card.height + "입니다.");
    }
}