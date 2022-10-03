package lambda_std;

public class No1_Lambda {
    /**
     * Lambda 람다식
     * : 함수(메서드)를 간단한 식으로 표현한 것(익명 객체)
     *
     * 작성방법
     * 1. 메서드의 이름과 반환타입을 제거하고 '->' 를 블록 {} 앞에 추가한다.
     * 2. 반환값이 있는 경우 : 식이나 값만 적고  return문은 생략 가능하다. (끝에 ; 안붙임)
     * 3. 매개변수의 타입이 추론 가능하다면 생략 가능(대부분의 경우 생략 가능)
     *
     * 주의사항
     * 1. 매개변수가 하나인 경우, () 생략 가능(타입이 없을 때만)
     * 2. 블록 안의 문장이 하나뿐일 때 {} 생략 가능(끝에 ; 안붙임). 단, 하나뿐인 문장이 return문이면 {} 생략 불가
    */

    public static void main(String[] args) {
        //사실 람다는 아래와 같은 형식의 익명 객체이다.
//        Object obj = new Object(){
//            int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };

//        MyFunction myFunction = new MyFunction(){
//            public int max(int a, int b) { //오버라이딩 규칙으로 인해 public을 써줘야한다.
//                return a > b ? a : b;
//            }
//        };
        //위 코드를 람다식으로!(람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.)
        MyFunction myFunction = (a, b) -> a > b ? a : b;

        int value = myFunction.max(3, 5); //함수형 인터페이스
        System.out.println("value = " + value);
    }
}

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 가져야함.
interface MyFunction {
    public abstract int max(int a, int b);
}
