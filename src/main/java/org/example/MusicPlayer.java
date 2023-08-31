package org.example;

public class MusicPlayer implements Playable {

    public MusicPlayer() {
    }

    @Override
    public String toString() {
        return "MusicPlayer{}";
    }

    @Override
    public void playable() {
        System.out.println("Music started playing");
    }
}
