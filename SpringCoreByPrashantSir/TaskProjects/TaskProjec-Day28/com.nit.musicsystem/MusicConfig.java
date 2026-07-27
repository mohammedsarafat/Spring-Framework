package com.nit.musicsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicConfig {

    @Bean
    public Speaker speaker1() {
        return new Speaker();
    }

    @Bean
    public Speaker speaker2() {
        return new Speaker();
    }

    @Bean
    public Amplifier amp1() {
        return new Amplifier();
    }

    @Bean
    public Amplifier amp2() {
        return new Amplifier();
    }

    @Bean
    public MusicPlayer musicPlayer(
            @Qualifier("speaker1") Speaker speaker,
            @Qualifier("amp1") Amplifier amplifier) {

        MusicPlayer player = new MusicPlayer();

        player.setSpeaker(speaker);
        player.setAmplifier(amplifier);

        return player;
    }
}
