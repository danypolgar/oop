package ch.hslu.oop.S11.A1_3;

import java.io.*;
import java.util.Arrays;

public class StreamDemo {

    public static void main(String[] args) {
        final DataOutputStream dos;
        try {
            dos = new DataOutputStream(new FileOutputStream("/Users/daniel/demo.txt"));
            dos.writeInt(5);
            dos.write("sakldjaskldjasld,.,ääàààé".getBytes());
            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        final DataInputStream dis;
        try {
            dis = new DataInputStream(new FileInputStream("/Users/daniel/demo.txt"));
            System.out.println(dis.readInt());
            System.out.println(new String(dis.readAllBytes()));
            dis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
