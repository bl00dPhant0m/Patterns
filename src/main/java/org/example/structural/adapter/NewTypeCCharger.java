package org.example.structural.adapter;

public class NewTypeCCharger implements TypeCCharger {
    @Override
    public void chargeWithTypeC() {
        System.out.println("Charging with type C");
    }
}
