package org.example.creational.factory;

import java.util.Arrays;

public class PlayerFactory {
    public static Player createPlayer(String fileName) {
        if (Arrays.asList(".mp3",".vaw",".raw").stream()
                .anyMatch(e-> fileName.endsWith(e))
        ) {
            return new AudioPlayer();
        } else if (Arrays.asList(".mp4", "avg").stream()
                .anyMatch(e-> fileName.endsWith(e))) {
            return new VideoPlayer();
        }else {
            throw new IllegalArgumentException("Unsupported file format");
        }
    }
}
