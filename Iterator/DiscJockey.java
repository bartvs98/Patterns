package Patterns.Iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

    SongsOfThe70s songsOfThe70s;
    SongsOfThe80s songsOfThe80s;
    SongsOfThe90s songsOfThe90s;

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator songsOfThe70s,
                      SongIterator songsOfThe80s,
                      SongIterator songsOfThe90s){

        iter70sSongs = songsOfThe70s;
        iter80sSongs = songsOfThe80s;
        iter90sSongs = songsOfThe90s;

    }

    public void showTheSongs(){

        Iterator songsOfThe70s = iter70sSongs.createIterator();
        Iterator songsOfThe80s = iter80sSongs.createIterator();
        Iterator songsOfThe90s = iter90sSongs.createIterator();

        System.out.println("\nSongs of the 70s");
        System.out.println("------------------");
        printTheSongs(songsOfThe70s);

        System.out.println("Songs of the 80s\n");
        System.out.println("------------------");
        printTheSongs(songsOfThe80s);

        System.out.println("Songs of the 90s\n");
        System.out.println("------------------");
        printTheSongs(songsOfThe90s);

    }

    public void printTheSongs(Iterator iterator){

        while(iterator.hasNext()){

            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());

        }

    }

}
