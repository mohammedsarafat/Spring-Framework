package com.nit.musicsystem;

public class MusicPlayer {

    private Speaker speaker;
    private Amplifier amplifier;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void playMusic() {

        amplifier.boostSignal();
        speaker.playSound();

        System.out.println("Music is now playing !!");
    }
}
