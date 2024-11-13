package org.example.creational.prototype.v1;
/*
Проблема: Повторное создание объектов затратным путем копирования их структуры.

Когда использовать: Когда создание новых объектов может быть дорогостоящим,
а копирование существующего объекта легче и быстрее.

Реализация:
А) 1. Создать интерфейс с методом клонирования.
   2. Реализовать этот интерфейс в классах, которые нужно копировать.
   3. Использовать метод клонирования для создания новых экземпляров.

Б) 1. Заимплиментить интерфейс Cloneable
   2. Переопределить метод clone
   3. Использовать метод клонирования для создания новых экземпляров(Нужно дополнительно приводить к типу, который нам нужен)
 */

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle("Круг");
        Circle clone = (Circle) circle.clone();

    }
}
