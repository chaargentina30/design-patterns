package me.dhcha.designpatterns.factorymethod._02_after;

public abstract class DefaultShipFactory implements ShipFactory {


    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println("complete order " + ship.getName() );
    }
}
