package oop_std.polymorphism_std.parameter;

public class Ex1 {
    public static void main(String[]args){
        Buyer buyer = new Buyer();

        Product tv = new Tv();
        buyer.buy(tv); //이 두 줄은
        buyer.buy(new Tv()); //이 한줄과 같은 의미이다.

        Product computer = new Computer();
        buyer.buy(computer);

        Product audio = new Audio();
        buyer.buy(audio);


        System.out.println("현재 남은돈 : " + buyer.money);
        System.out.println("적립금 : " + buyer.bonusPoint);

    }

}

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {
    Tv() {
       super(2000);
    }
}
class Computer extends Product {
    Computer() {
        super(3000);
    }
}
class Audio extends Product {
    Audio() {
        super(4000);
    }
}

class Buyer {
    int money = 10000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p.toString() + "을/를 구입하셨습니다.");
    }
}