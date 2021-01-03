package designPatters.singleton;

public class GlobalSynchronizationSingleton {

    private GlobalSynchronizationSingleton() {
            // NOP
    }

    private static GlobalSynchronizationSingleton INSTANCE = null;

    public static synchronized GlobalSynchronizationSingleton getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new GlobalSynchronizationSingleton();
        }
        return INSTANCE;
    }

}
