package io;

import java.io.*;

/**
 * Created by Yang on 2016/1/23.
 */
public class Copy {
    public static final int BUFFER_LENGTH = 1024;

    public static void main(String[] args) throws IOException{
        if (args == null || args.length !=2){
            throw new RuntimeException("Use like: copy <src-file> <dest-file>");

        }
        Reader reader = new FileReader(args[0]);
        Writer writer = new FileWriter(args[1]);
        char[] buffer = new char[BUFFER_LENGTH];
        int count;
        while ((count = reader.read(buffer)) !=1){
            writer.write(buffer,0,count);
        }
        reader.close();
        writer.close();
    }
}
