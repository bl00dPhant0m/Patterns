package org.example.structural.adapter;

public class UsbToTypeCAdapter implements TypeCCharger{
    private UsbCharger usbCharger;

    public UsbToTypeCAdapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("Adapting USB to type C...");
        usbCharger.chargeWithUsb();
    }
}
