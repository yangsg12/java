package producer_customer;

/**
 * Created by Yang on 2016/7/20.
 */
public class Info {
    private String name= "Name ";
    private String content = "Content";
    private boolean flag = true;

    public synchronized void set(String name, String content){
        while (!flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setName(name);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setContent(content);
            flag = false;
            this.notify();
        }
    }


    public synchronized void get(){
        while (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(this.getName()+ "---> "+ this.getContent());
            flag = true;
            super.notify();
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
