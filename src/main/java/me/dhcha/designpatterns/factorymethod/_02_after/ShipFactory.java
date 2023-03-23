package me.dhcha.designpatterns.factorymethod._02_after;

public class ShipFactory {

    public static Ship orderShip(String name , String email ) {

        if( name == null || name.isBlank() ) {
            throw new IllegalArgumentException("please write ship name.");
        }
        if( email == null || email.isBlank() ) {
            throw new IllegalArgumentException("please write email.");
        }

        prepareFor(name);


        Ship ship = new Ship();
        ship.setName(name);

        if( name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("WHITE");
        } else if( name.equalsIgnoreCase("blackship")) {
            ship.setLogo("BLACK");
        }

        if(name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if(name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;

    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println("complete order " + ship.getName() );
    }

    private static void prepareFor(String name) {
        System.out.println("prepare order " + name );
    }
}
