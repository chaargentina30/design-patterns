package me.dhcha.designpatterns._01_singleton;

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
            ==> how to avoid refection : enum
        use Serialization, Deserialization
            ==> how to avoid Deserialization : readResolve





*/

    public static void main( String[] args ) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Settings settings = Settings.INSTANCE;
        Settings settings1= null;

        Constructor<?>[] constructors = Settings.class.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }


        System.out.println(settings == settings1);



    }
}
