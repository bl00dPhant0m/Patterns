package org.example.structural.proxy;

public class ProxyImg implements Img{
    private String fileName;
    private RealImg realImg;

    public ProxyImg(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if(realImg == null) {
            realImg = new RealImg(fileName);
        }
        realImg.display();
    }

    @Override
    public void send(String mail) {
        if(realImg == null) {
            realImg = new RealImg(fileName);
        }
        realImg.send(mail);
    }
}
