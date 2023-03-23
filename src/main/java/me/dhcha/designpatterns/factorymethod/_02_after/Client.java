package me.dhcha.designpatterns.factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        final Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("whiteship", "dhc@mail.me");
        System.out.println( whiteship.toString() );
        Ship blackship = ShipFactory.orderShip("blackship", "dhc@mail.me");
        System.out.println( blackship.toString() );
    }
}
