package org.example.creational.prototype.v1;

public class Square extends ShapeForm{
    public Square(String form) {
        this.form = form;
    }

    @Override
    void draw() {
        System.out.println(form);
    }

}
