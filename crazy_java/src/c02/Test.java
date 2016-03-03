package c02;

/**
 * Created by Yang on 2015/7/11.
 */
public class Test {
    public static void main(String[] args) {
        new Derived();
    }
}


class Base{
    // 执行？
    private int i = 2;

    public Base() {
        System.out.println("base no para");
        System.out.println("this.i =="+this.i);
        this.display();
        System.out.println(i);
        System.out.println("=========");
    }

    public void display() {
        System.out.println("base display"+i);
    }
}

class Derived extends Base{
    private int i = 22;

    public Derived() {
        System.out.println("derived no para");
        i =222;
        System.out.println("derived i " + i);
    }

    public void display() {
        System.out.println(i);
    }
}