package me.dhcha.designpatterns.singleton;

/**
 * Hello world!
 *
 */
public class App 
{
/*
    Singleton pattern
    class provided only one instance

    keyword 'new' not use
    private, static

    but multi-thread(example , web) is not safe.

    how to thread-safe
    use keyword 'synchronized' ==> lock unlock

    eager initialization ==> if many resource use or need eager initialization is not useful

    double-checked locking used keyword 'synchronized' ==> what is volatile 'keyword'

    use static inner class


*/

    public static void main( String[] args ) {

        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(settings1 == settings);
        System.out.println(settings1 == Settings.getInstance());


    }
}
