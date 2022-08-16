package generic_std;

import java.util.ArrayList;

interface Eatable {}

class Fruit implements Eatable {
    public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy                 { public String toString() {return "Toy";}}

//BoxŬ������ � Ÿ���� ������ ����� ����.
class Box<T>{
    ArrayList<T> list = new ArrayList<>(); //item�� ������ ����Ʈ
    void add(T item) {list.add(item);} //�ڽ��� item�� �߰��� �޼���
    T get (int i) {return list.get(i);} //�ڽ����� item�� ������ �޼���
    int size() {return list.size();}
    public String toString() {return list.toString();}
}

//FruitBoxŬ������ Eatable�� �����߰ų� Fruit�� �ڼ�Ÿ�Ը� ���� �� �ִ�.
class FruitBox<T extends Fruit & Eatable> extends Box<T> {} //��, T���� Eatable�� �����߰ų� Fruit�� �ڼո� ���� �� �ִ�.

public class No5_Interface {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); //Eatable�� �����߰� Fruit �� ��ü�̱� ������ ����
        FruitBox<Apple> appleBox = new FruitBox<Apple>(); //Fruit�� �ڼ��̱� ������ ����
        FruitBox<Grape> grapeBox = new FruitBox<Grape>(); //Fruit�� �ڼ��̱� ������ ����
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); //����. Eatable�� ����������, Fruit�� �ڼյ� �ƴϱ� ������ �Ұ���
        Box<Toy> toyBox = new Box<>(); //�׳� Box������ �ȴ�. Ÿ�Ժ����� 'T'�̱� ������ ��ü�� ���� �� �� �ִ�.

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        grapeBox.add(new Grape());

    }
}
