package me.dhcha.designpatterns.factorymethod._02_after;

public interface ShipFactory {
    default Ship orderShip(String name , String email ) {
        validate( name , email );
        prepareFor(name);

        Ship ship = createShip();
        sendEmailTo(email,ship);

        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if( name == null || name.isBlank() ) {
            throw new IllegalArgumentException("please write ship name.");
        }
        if( email == null || email.isBlank() ) {
            throw new IllegalArgumentException("please write email.");
        }

    }

    private void prepareFor(String name) {
        System.out.println("prepare order " + name );
    }

    void sendEmailTo(String email, Ship ship);


}
