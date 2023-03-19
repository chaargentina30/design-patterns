package me.dhcha.designpatterns.singleton;

public class ReviewApp {
/*
    자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?
        ===>
            static inner class
    private 생성자와 static 메서드를 사용하는 방법의 단점은?
        ===>
            사용 할 때 인스턴스를 만들지 않고 초기에 만들며
            리플렉션 , 역직렬화로 원치않는 인스턴스를 생성 가능하게 한다
    enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
        ===>
            장점 :리플렉션 ,역직렬화로 원치 않는 인스턴스 생성을 막을 수 있다
            단점 : 사용 시 만들지 않고 초기에 생성한다

    static inner 클래스를 사용해 싱글톤 패턴을 구현해라
        ===> this ReviewApp
*/
    public static void main(String[] args) {

        ReviewSettings reviewSettings = ReviewSettings.getInstance();
        ReviewSettings reviewSettings1 = ReviewSettings.getInstance();
        ReviewSettings reviewSettings2 = ReviewSettings.getInstance();

        System.out.println( reviewSettings1 == reviewSettings );
        System.out.println( reviewSettings2 == reviewSettings );


    }
}
