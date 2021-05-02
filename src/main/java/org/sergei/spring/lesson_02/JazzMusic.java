package org.sergei.spring.lesson_02;

public class JazzMusic implements Music {
    private JazzMusic() {
    }

    public static JazzMusic getJazzMusicInstance() {
        return new JazzMusic();
    }

    @Override
    public String getSong() {
        return "Take five";
    }
}
