package designPatters.singleton;

public class LazyLoadingSingleton {

    private LazyLoadingSingleton() {
        // NOP
    }

    private static LazyLoadingSingleton INSTANCE = null;

    public static LazyLoadingSingleton getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new LazyLoadingSingleton();
        }
        return INSTANCE;
    }
}
