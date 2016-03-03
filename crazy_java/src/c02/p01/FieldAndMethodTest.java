package c02.p01;

/**
 * Created by Yang on 2015/7/11.
 */
public class FieldAndMethodTest {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.count);
        b.display();
        System.out.println("=========1");

        Derived derived = new Derived();
        System.out.println(derived.count);
        derived.display();
        System.out.println("=========2");

        Base base2 = new Derived();
        System.out.println(base2.count);
        base2.display();
        System.out.println("=========3");

        Base d2b =derived;
        System.out.println(d2b.count);
    }

}

class Base{
    int count = 2;

    public void display() {

        System.out.println(this.count);
        System.out.println("=======Base display===");
    }
}

class Derived extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println("derived display ------"+this.count);
    }
}
