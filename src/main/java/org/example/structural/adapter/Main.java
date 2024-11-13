package org.example.structural.adapter;
/*
Проблема: Необходимо использовать классы с несовместимыми интерфейсами.

Когда использовать: Нет возможности, связи между двумя объектами.

Реализация:
1. Создать класс-адаптер, который реализует интерфейс, ожидаемый клиентом.
2. Внутри адаптера вызовите методы несовместимого объекта.
 */

public class Main {
    public static void main(String[] args) {
        UsbCharger oldUsbCharger = new OldUsbCharger();
        TypeCCharger adapter = new UsbToTypeCAdapter(oldUsbCharger);

        adapter.chargeWithTypeC();
    }
}
