package c02;

/**
 * Created by Yang on 2015/7/11.
 */
public class InitTest {

    public static void main(String[] args) {
        new Wolf(5.6);
    }
}

class Creature{
    {
        System.out.println("1 creature 非静态 初始化 块");
    }

    public Creature() {
        System.out.println("1 create 无参 构造 执行了");
    }

    public Creature(String name) {
        //this() call anther
        this();
        System.out.println("1 create 有参数 构造 " + name);
    }
}

class Animal extends Creature {
    {
        System.out.println("2 animal 非静态 初始化块");
    }

    public Animal(String name) {
        super(name);
        System.out.println("2 animal 有参数 构造 "+ name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("2 animal 两个有参数" + name +" "+age);
    }
}

class Wolf extends Animal{
    {
        System.out.println("3 wolf 非静态 初始化块");
    }

    public Wolf() {
        // 显式 调用 父类
        super("灰太狼", 3);
        System.out.println("3 wolf 无参数 构造器");
    }

    public Wolf(double weight) {
        this();
        System.out.println("3 wolf 带 weight "+ weight);
    }
}
