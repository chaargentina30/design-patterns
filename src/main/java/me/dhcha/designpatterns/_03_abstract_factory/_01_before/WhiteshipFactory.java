package me.dhcha.designpatterns._03_abstract_factory._01_before;

import me.dhcha.designpatterns._02_factorymethod._02_after.DefaultShipFactory;
import me.dhcha.designpatterns._02_factorymethod._02_after.Ship;
import me.dhcha.designpatterns._03_abstract_factory._02_after.ShipPartsFactory;
import me.dhcha.designpatterns._03_abstract_factory._02_after.WhiteAnchor;
import me.dhcha.designpatterns._03_abstract_factory._02_after.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory( ShipPartsFactory shipPartsFactory ) {
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
