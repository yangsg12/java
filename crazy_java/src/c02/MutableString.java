package c02;

/**
 * Created by Yang on 2015/7/12.
 */
public class MutableString {
    public static void main(String[] args) {
        // stringBuffer 加了 sync
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str.append("Java");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }


}
