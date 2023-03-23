package me.dhcha.designpatterns.factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship" , "dhc@mail.me");
        client.print(new BlackShipFactory(), "blackship" , "dhc@mail.me");


    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip("whiteship" , "dhc@mail.me"));
    }
}
