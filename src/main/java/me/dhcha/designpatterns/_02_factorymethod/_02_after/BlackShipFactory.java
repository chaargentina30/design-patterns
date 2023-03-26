package me.dhcha.designpatterns._02_factorymethod._02_after;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
