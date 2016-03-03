package singleton;

/**
 * Created by Yang on 2015/7/12.
 */
public class StaticSingleton {
    // 同步关键字 低 效率 解决
    private StaticSingleton() {
        System.out.println("staticSingleton is create");
    }
    //内部类
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
