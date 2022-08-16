package generic_std;

import java.util.ArrayList;

class Tv extends Product{}
class Audio extends Product{}
class Product{}

public class No2_TypeVariable {
    /**
     * 타입 변수 : 지네릭클래스(List, Map 등)를 작성할 때, Object타입을 E, Y, EE등의 변수로 지정하는 것
     * but, 객체를 생성할 시에는 타입변수 대신 실제 타입을 지정해야한다.
     *
     * 제약사항
     * 1. static필드에 타입변수 사용 불가
     * 2. 배열, 객체배열을 생성할 때 타입변수 사용 불가. but 타입변수로 배열 선언은 가능
     */
    public static void main(String[] args) {
        //제네릭 클래스를 사용하기 전
        //list에 모든 타입의(Object) 객체를 넣을 수 있어서 잘못된 객체가 들어갈 위험이 크다.
        ArrayList list = new ArrayList();
        list.add(new Tv());
        list.add(new Audio());
        Tv t1 = (Tv)list.get(0); //Object타입으로 들어갔기 때문에 꺼낼 때 형변환을 해줘야한다.

        //제네릭 클래스 사용 #1
        //<Tv>부분이 타입변수 부분. 사용할 땐 이렇게 실제 객체를 넣어주어야한다.
        ArrayList<Tv> list2 = new ArrayList<Tv>(); //이젠 모든 타입이 들어올 수 없고 Tv객체만 list에 담길 수 있게 되었다.
        list2.add(new Tv());
//        list2.add(new Audio()); //에러. 무조건 Tv타입만 들어올 수 있다.
        Tv t2 = list2.get(0); //처음부터 Tv타입만 받았기 때문에 꺼낼 때 형변환을 해주지 않아도 된다.

        //제네릭 클래스 사용 #2
//        ArrayList<Object> list3 = new ArrayList<Tv>(); //에러
        //참조변수에 대입된 타입과 생성자에 대입된 타입은 같아야한다.
        //타입이 다른 경우도 있긴 하지만 기본적으로는 같아야한다.

        //제네릭 클래스 사용 #3
        //매개변수의 다형성은 성립
        ArrayList<Product> list4 = new ArrayList<Product>(); //여전히 참조변수에 대입된 타입과 생성자에 대입된 타입은 같아야 하지만,
//        ArrayList<Product> list4 = new ArrayList<Tv>(); //에러(타입 불일치 - 참조변수,생성자간의 타입일치 룰은 상속관계도 허용하지 않음.)
        list4.add(new Product()); // 메서드의 매개변수는 다형성이 성립한다.
        list4.add(new Tv()); //Tv클래스는 Product를 상속받았기 때문에 사용가능.
        list4.add(new Audio()); //마찬가지
    }


    class Box<T> {
        //제네릭 클래스의 제약사항 #1
//        static T item; //에러
//        static int compare(T t1, T t2) {return 0;} //에러

        //제네릭 클래스의 제약사항 #2
        T[] itemArr; //Ok 객체배열 '선언'!

//        T[] toArray() {
//            T[] tmpArr = new T[itemArr.length]; //에러. 지네릭 배열 '생성' 불가.
//        }

   }
}
