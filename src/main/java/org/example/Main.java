package org.example;

public class Main {
    public static void main(String[] args) {

        MediaController media = new MediaController();

        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();

        // Aufruf über MediaController class
        media.playMedia(music);
        media.playMedia(video);

        Playable mediaAudio = new MusicPlayer();
        Playable mediaVideo = new VideoPlayer();

        media.playMedia(mediaAudio);
        media.playMedia(mediaVideo);

        //Aufruf direkt über MusicPlayer und VideoPlayer class
        mediaAudio.playable();
        mediaVideo.playable();

    }
}