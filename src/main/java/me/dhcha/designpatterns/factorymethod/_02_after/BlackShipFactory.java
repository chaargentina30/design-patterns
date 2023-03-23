package me.dhcha.designpatterns.factorymethod._02_after;

public class BlackShipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
