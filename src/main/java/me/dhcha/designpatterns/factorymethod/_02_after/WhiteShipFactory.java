package me.dhcha.designpatterns.factorymethod._02_after;

public class WhiteShipFactory extends DefaultShipFactory {


    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
