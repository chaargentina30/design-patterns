package me.dhcha.designpatterns._03_abstract_factory._02_after;

import me.dhcha.designpatterns._02_factorymethod._02_after.Ship;
import org.springframework.beans.factory.FactoryBean;

public class ExampleShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Ship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
