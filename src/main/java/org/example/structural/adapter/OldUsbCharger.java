package org.example.structural.adapter;

public class OldUsbCharger implements UsbCharger {
    @Override
    public void chargeWithUsb() {
        System.out.println("Usb charger charge with usb");
    }
}
