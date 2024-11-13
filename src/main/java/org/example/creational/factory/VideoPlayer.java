package org.example.creational.factory;

public class VideoPlayer implements Player{
    @Override
    public void play(String fileName) {
        System.out.println("Playing " + fileName +"on VideoPlayer");
    }
}
