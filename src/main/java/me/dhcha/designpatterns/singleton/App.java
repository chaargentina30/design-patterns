package me.dhcha.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    how to break singleton pattern
        use reflection



*/

    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Settings settings = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();



        System.out.println(settings1 == settings);



    }
}
