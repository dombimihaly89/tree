package hu.flowacademy;

import java.io.File;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        File f = new File("/home/misi/Desktop/Meme");
        String str = "";
        int counter = 0;
        tree(f, str, counter);
    }
    /*
    if (f.isFile()) {
        System.out.println(str + file.getName());
    } else System.out.println(file.getName()); */

    public static void tree(File f, String str, int counter) {
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(str + file.getName());
            if (file.isDirectory()) {
                String tab = "";
                for (int i = 0; i < counter; i++) {
                    tab += "-------";
                }
                counter++;
                tree(file, tab, counter);
            }
            /*else {
                String line = file.getName();
                System.out.println("\t" + line);
            }*/
        }

    }
}
