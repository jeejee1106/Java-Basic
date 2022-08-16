package generic_std;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy                 { public String toString() {return "Toy";}}

//Box클래스는 어떤 타입이 들어오던 상관이 없다.
class Box<T>{
    ArrayList<T> list = new ArrayList<>(); //item을 저장할 리스트
    void add(T item) {list.add(item);} //박스에 item을 추가할 메서드
    T get (int i) {return list.get(i);} //박스에서 item을 꺼내는 메서드
    int size() {return list.size();}
    public String toString() {return list.toString();}
}

//FruitBox클래스는 Eatable을 구현했거나 Fruit의 자손타입만 들어올 수 있다.
class FruitBox<T extends Fruit & Eatable> extends Box<T> {} //즉, T에는 Eatable을 구현했거나 Fruit의 자손만 들어올 수 있다.

public class No5_Interface {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); //Eatable을 구현했고 Fruit 그 자체이기 때문에 가능
        FruitBox<Apple> appleBox = new FruitBox<Apple>(); //Fruit의 자손이기 때문에 가능
        FruitBox<Grape> grapeBox = new FruitBox<Grape>(); //Fruit의 자손이기 때문에 가능
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); //에러. Eatable을 구현하지도, Fruit의 자손도 아니기 때문에 불가능
        Box<Toy> toyBox = new Box<>(); //그냥 Box에서는 된다. 타입변수가 'T'이기 때문에 객체는 뭐든 들어갈 수 있다.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        grapeBox.add(new Grape());

    }
}
