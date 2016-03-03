package singleton;

/**
 * Created by Yang on 2015/7/12.
 */
public class LazySingleton implements Runnable{
    private LazySingleton() {
        System.out.println("lazy singleton created");
    }
    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void createString() {
        System.out.println("crate String!");
    }

    public static void main(String[] args) {
       // LazySingleton.createString();
        for (int i = 0; i < 5; i++) {
            new Thread(new LazySingleton()).start();
        }
    }

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LazySingleton.getInstance();
        }
        System.out.println(System.currentTimeMillis() - beginTime);
    }
}
