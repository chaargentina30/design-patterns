package me.dhcha.designpatterns._03_abstract_factory._02_after;

import me.dhcha.designpatterns._02_factorymethod._02_after.DefaultShipFactory;
import me.dhcha.designpatterns._02_factorymethod._02_after.Ship;
/*
    factory-method
    인스턴스를 만드는 개체를 만드는 과정을 추상화
    팩토리를 구현하는 방법

    abstract-factory-method
    인스턴스를 만드는 개체를 만드는 과정을 추상화
    팩토리를 사용하는 방법

*/

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory ) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor( shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
