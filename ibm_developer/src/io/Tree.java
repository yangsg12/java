package io;

import java.io.File;

/**
 * Created by Yang on 2016/1/23.
 */

public class Tree {
    public static void main(String[] args) {
        if (args == null || args.length == 0){
            displayFiles(new File("."),0);
        }else {
            displayFiles(new File(args[0]), 0);
        }
    }

    private static void displayFiles(File directory, int depth){
        File[] files = directory.listFiles();
        if (files != null){
            for (File file : files) {
                for (int i = 0; i < depth - 1; i++) {
                    System.out.println("| ");
                }
                if (depth != 0 ){
                    System.out.println("|--");
                }
                System.out.println(file.getName());
                if (file.isDirectory()){
                    displayFiles(file,depth+1);
                }
            }
        }
    }
}
