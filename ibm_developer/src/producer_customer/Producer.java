package producer_customer;

/**
 * Created by Yang on 2016/7/20.
 */
public class Producer implements Runnable {

    private Info  info;

    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            if (flag){
                this.info.set("姓名 1 ","内容 1 ");

                flag = false;
            }else {
                this.info.set("姓名 2 ","内容 2 ");
                flag = true;
            }
        }

    }
}
