package org.example.creational.prototype.v1;

public class Circle extends ShapeForm {
    public Circle(String form) {
        this.form = form;
    }

    @Override
    void draw() {
        System.out.println(form);
    }
}
