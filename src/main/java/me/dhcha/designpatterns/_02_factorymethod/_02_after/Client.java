package me.dhcha.designpatterns._02_factorymethod._02_after;

public class Client {
/*
    factory method good
        my-answer : 어떤 객체를 생성 해서 그 객체의 행위 내용 중 및 바꿔야 할 내용을 하나의 객체에서 작업하는 것보다는
                    그 객체를 생성 및 행동을 잡아주는 팩토리 개념의 상위 클래스를 통해 객체 생성을 담당하여 관리
        teacher : 확장이 열려있고 변경이 닫혀있는  기존 인스턴스 만드는 과정의 로직을 건드리지 않고 그와 같은 류의 새로운 인스턴스를
                  다른 방법으로 얼마든지 확장이 가능하다
                  프로덕트와 크리에이터와 같이 루즈링 커플드 느슨한 결합
    factory method bad
        my-answer : 설명만 들었을땐 나쁜점이 없어 보인다
        teacher : 클래스가 늘어나는 단점
    java OCP
        my-answer : open closed principal 열려있되 변경은 안되고 확장은 잘 되는 객체 지향 개발 이론 중 하나
        teacher : 변경에 닫혀있다 --> 기존 코드를 변경하지 않으면서 새로운 기능을 얼마든지 확장 할 수 있게 하는 구조를 만드는 객체지향 구조
    java 8 default method
        my-answer : 인터페이스에서는 메서드 정의만 할 수 있고 구현은 불가했으나 default method 생김으로 구현도 가능
        teacher : 인터페이스에서 구현체를 만들 수 잇는



*/

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship" , "dhc@mail.me");
        client.print(new BlackShipFactory(), "blackship" , "dhc@mail.me");


    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip("whiteship" , "dhc@mail.me"));
    }
}
