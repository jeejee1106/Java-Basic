package generic_std;

import java.util.ArrayList;

public class No1_GenericBasic {
    /**
     * Generic 클래스?
     * : 컴파일 시 타입을 체크주는 기능
     * : 일반클래스였던 ArrayList, HashMap 등의 클래스들이 Generic클래스로 바뀌었다.
     */
    public static void main(String[] args) {
        /**
         * #1 Generic 사용 안했을 때
         */
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30"); //String을 추가

        Integer a = (Integer)list.get(0); //list에 담긴 타입은 Object타입이기 때문에 형변환 필수
        Integer b = (Integer)list.get(1);
        int aa = (int) list.get(0); //int형으로도 형반환 가능하다.
//        Integer c = (Integer)list.get(2); //컴파일 OK. but 런타임시 에러가 난다. ClassCastException

        // Generic 클래스는 이렇게 런타임에러를 컴파일 할 때 잡아주기 위해 나타났다.
        // 실행 시 에러가 발생하는 것보다 컴파일 할 때 에러를 나게 해서 잡아주는 것이 나으니까!

        /**
         * #2 Generic 사용 시
         */
        ArrayList<Integer> list2 = new ArrayList();
        list2.add(10);
        list2.add(20);
//        list2.add("30"); //컴파일에러 발생. Generic에 지정해준 타입과 일치하지 않음!
        //실수로 다른 객체를 넣을 위험이 줄어든다.(타입안정성)

        Integer a2 = list2.get(0); //형변환 생략가능(자동 형변환). 알맞은 타입을 넣었고, 꺼내오는 것이기 때문에.
        Integer b2 = list2.get(1); //컴파일 시 컴파일러가 자동 형변환 해줌

        /**
         * #3 Generic과 Object
         */
        ArrayList<Object> list3 = new ArrayList<Object>();
        //이렇게 적어주면 Generic을 사용하지 않을 때(#1)와 똑같이 Object타입의 모든 객체가 들어갈 수 있다.
        //그럼 #1처럼 쓰면되지 왜 <Object>를 적어주느냐??
        //암묵적인 룰! 이왕이면 타입을 정확히 명시해주는 것이 좋지 않은가!
        //실제로 ArrayList의 코드를 뜯어보면 예전엔 ArrayList였지만(일반클래스) 현재는 ArrayList<E>로(지네릭클래스) 적혀있다는 것을 알 수 있다.
    }
}
