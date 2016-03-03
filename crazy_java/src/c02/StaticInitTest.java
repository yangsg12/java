package c02;

/**
 * Created by Yang on 2015/7/11.
 */
public class StaticInitTest {
    static int count =2;
    static {
        System.out.println("静态初始化块");
        name = "block 里的";
    }

    static String name = "静态变量";

    public static void main(String[] args) {
        System.out.println("count " + StaticInitTest.count);
        System.out.println("static name is "+ StaticInitTest.name);
    }
}
