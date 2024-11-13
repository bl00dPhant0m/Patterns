package org.example.creational.prototype.v2;

public class Auto implements AutoPrototype {
    private String _name;
    private int year;


    public Auto(String _name, int year) {
        this._name = _name;
        this.year = year;
    }

    @Override
    public Auto clone() {
        return new Auto(_name, year);
    }
}
