package org.example.creational.factory;

import java.util.Scanner;

/*
Проблема: Нужно легко менять типы создаваемых объектов.

Когда использовать: Когда нужно делегировать создание объектов, или требуется гибкое создание объектов.

Реализация:
1. Сделать общий интерфейс для возвращаемых объектов
2. Реализовать метод для создания разных типов объектов
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        PlayerFactory.createPlayer(fileName)
                .play(fileName);
    }
}
