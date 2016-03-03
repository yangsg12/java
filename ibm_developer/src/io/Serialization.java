package io;

import java.io.*;

/**
 * Created by Yang on 2016/1/23.
 */
public class Serialization {
    public void writeObject() throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("save.txt"));
        Bean bean = new Bean(true, 3.14, "就是我");
        output.writeObject(bean);
    }

    public void readObject() throws IOException ,ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("save.txt"));
        Bean bean = (Bean)input.readObject();
        System.out.println(bean);
    }

    public void test() throws IOException,ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("save.txt"));
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("save.txt"));
        Bean bean = new Bean(true, 3.14, "hehe");
        output.writeObject(bean);
        bean.setName("change name");
        output.writeObject(bean);

        Bean readBean1 = (Bean) input.readObject();
        Bean readBean2 = (Bean) input.readObject();
        System.out.println(("readBean1 == readBean2 " + (readBean1).equals(readBean2)));
        System.out.println(readBean1);
        System.out.println(readBean2);
    }
}
