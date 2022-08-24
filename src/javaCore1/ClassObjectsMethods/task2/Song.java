package javaCore1.ClassObjectsMethods.task2;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object song) {
        if (this == song) return true;
        if (song == null) return false;
        if (this.getClass() != song.getClass()) return false;
        Song otherSong = (Song) song;
        return Objects.equals(title, otherSong.title) &&
               Objects.equals(artist, otherSong.artist) &&
                Objects.equals(songwriter, otherSong.songwriter);
    }
}