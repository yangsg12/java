package producer_customer;

/**
 * Created by Yang on 2016/7/20.
 */
public class Customer implements Runnable {
    private Info info ;

    public Customer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.info.get();
        }
    }
}
