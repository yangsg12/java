package singleton;

/**
 * Created by Yang on 2015/7/12.
 */
public class Singleton {
    // 1. private constructor
    private Singleton() {
        System.out.println("singleton is create");
    }

    // 2. private static
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("create string in singleton!");
    }

    public static void main(String[] args) {
        //未使用 ，也被创建了
        Singleton.createString();
    }
}
