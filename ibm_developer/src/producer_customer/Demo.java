package producer_customer;

/**
 * Created by Yang on 2016/7/20.
 */
public class Demo {
    public static void main(String[] args) {
        Info info = new Info();
        Producer producer = new Producer(info);
        Customer customer = new Customer(info);

        new Thread(producer).start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(customer).start();
    }
}
