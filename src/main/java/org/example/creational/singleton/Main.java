package org.example.creational.singleton;
/*
Проблема: Нужно гарантировать, что у класса будет только один экземпляр, и предоставить к нему глобальную точку доступа.

Когда использовать: Когда требуется ограничить создание экземпляров класса и обеспечить его уникальность.

Реализация:
1. Создать класс с приватным конструктором.
2. Реализовать статический метод для доступа к единственному экземпляру класса(return singleton)

 */

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
