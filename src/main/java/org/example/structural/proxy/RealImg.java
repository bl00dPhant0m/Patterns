package org.example.structural.proxy;

public class RealImg implements Img {
    String fileName;

    public RealImg(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println(fileName);
    }

    @Override
    public void send(String mail) {
        System.out.println("send to " + mail);
    }
}
