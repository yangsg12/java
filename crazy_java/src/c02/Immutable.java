package c02;

/**
 * Created by Yang on 2015/7/12.
 */
public class Immutable {
    public static void main(String[] args) {
        String str = " Hello";
        System.out.println(System.identityHashCode(str));
        str = str + "Java";
        System.out.println(System.identityHashCode(str));
    }
}
