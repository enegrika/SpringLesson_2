package org.sergei.spring.lesson_02;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }


    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println(this.name + " playing " + music.getSong() + " at volume level : " + this.volume);
    }

    public void playMusicList() {

        for (Music music : musicList) {
            System.out.println(this.name + " playing " + music.getSong() + " at volume level : " + this.volume);
        }

    }

}
