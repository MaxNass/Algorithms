package designPatters.singleton;

public class LocalSynchronizationSingleton {

    private LocalSynchronizationSingleton() {
        // NOP
    }

    private static LocalSynchronizationSingleton INSTANCE = null;

    public static LocalSynchronizationSingleton getInstance()
    {
        if (INSTANCE == null)
        {
            synchronized(LocalSynchronizationSingleton.class)
            {
                if (INSTANCE == null) {
                    INSTANCE = new LocalSynchronizationSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
