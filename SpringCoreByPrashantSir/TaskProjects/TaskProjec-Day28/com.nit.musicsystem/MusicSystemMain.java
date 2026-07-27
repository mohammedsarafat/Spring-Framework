package com.nit.musicsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MusicSystemMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MusicConfig.class);

        MusicPlayer player = context.getBean(MusicPlayer.class);

        player.playMusic();
    }
}
