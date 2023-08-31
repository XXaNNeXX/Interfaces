package org.example;

public class VideoPlayer implements Playable{

    public VideoPlayer() {
    }

    @Override
    public String toString() {
        return "VideoPlayer{}";
    }

    @Override
    public void playable() {
        System.out.println("Video started playing");
    }
}
