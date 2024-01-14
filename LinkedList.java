/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlist_villarico;

/**
 *
 * @author COMLAB101
 */
import java.util.LinkedList;

public class LinkedList_Villarico {
    public static void main(String[] args) {

        LinkedList<String> songTitles = new LinkedList<>();
        LinkedList<String> artistNames = new LinkedList<>();
        LinkedList<String> albumTracks = new LinkedList<>();

        songTitles.add("Fetty");
        songTitles.add("Finnese");
        songTitles.add("LUV DRUG");
        songTitles.add("TBH");
        songTitles.add("MERCEDES");

        artistNames.add("Realest Cram");
        artistNames.add("Drake");
        artistNames.add("Eros Tongco");
        artistNames.add("PARTYNEXTDOOR");
        artistNames.add("Brent Faiyaz");

        for (int i = 0; i < songTitles.size(); i++) {
            String track = songTitles.get(i) + " - " + artistNames.get(i);
            albumTracks.add(track);
        }

        System.out.println("Song Titles:");
        for (String song : songTitles) {
            System.out.println(song);
        }

        System.out.println("\n Artist Names:");
        for (String artist : artistNames) {
            System.out.println(artist);
        }

        System.out.println("\n Album Tracks:");
        for (String track : albumTracks) {
            System.out.println(track);
        }
    }
}