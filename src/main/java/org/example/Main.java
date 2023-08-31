package org.example;

public class Main {
    public static void main(String[] args) {

        MediaController media = new MediaController();

        Playable music = new Playable() {
            @Override
            public void playable() {
                System.out.println("Music started playing");
            }
        };

        Playable video = new Playable() {
            @Override
            public void playable() {
                System.out.println("Video started playing");
            }
        };

        media.playMedia(music);
        media.playMedia(video);

        Playable mediaAudio = new MusicPlayer();
        Playable mediaVideo = new VideoPlayer();

        mediaAudio.playable();
        mediaVideo.playable();
    }
}