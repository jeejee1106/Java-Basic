package oop_std.class_std;

import java.util.Objects;

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Card2)){
            return false;
        }
        Card2 c = (Card2) obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    //equals를 오버라이딩 하면 hashCode도 오버라이딩 해야한다.
    @Override
    public int hashCode() {
        return Objects.hash(kind, number);
    }

    @Override
    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

class Test{
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2();

        System.out.println(c1.equals(c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
