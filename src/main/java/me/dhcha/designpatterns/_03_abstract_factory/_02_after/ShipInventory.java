package me.dhcha.designpatterns._03_abstract_factory._02_after;

import me.dhcha.designpatterns._02_factorymethod._02_after.Ship;

public class ShipInventory {

    public static void main(String[] args) {
        WhiteshipFactory whiteshipFactory = new WhiteshipFactory( new WhiteShipPartsProFactory() );
        Ship ship = whiteshipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
