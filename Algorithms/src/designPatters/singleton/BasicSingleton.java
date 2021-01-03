package designPatters.singleton;

public class BasicSingleton {


    private BasicSingleton() {
        // NOP
    }

    private static BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }
}
