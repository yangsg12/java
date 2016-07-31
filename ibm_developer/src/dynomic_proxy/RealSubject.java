package dynomic_proxy;

/**
 * Created by Yang on 2016/7/20.
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println(" I want to rent house!");
    }

    @Override
    public void hello(String string) {
        System.out.println("Hello "+ string);
    }
}
