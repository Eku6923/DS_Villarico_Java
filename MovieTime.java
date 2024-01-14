/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author COMLAB101
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter movie " + i + " of 3: ");
            String Movies = scan.nextLine();
            movies.offer(Movies);
        }
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter snack " + i + " of 3: ");
            String Snacks= scan.nextLine();
            snacks.offer(Snacks);
        }
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println("Press 'S' each time you finish a snack.");

        while (!snacks.isEmpty()) {
            String key = scan.nextLine();
            if (key.equalsIgnoreCase("S")) {
                snacks.poll();
                System.out.println(snacks);
            }
        }
        if (snacks.isEmpty()) {
            System.out.println("No more snacks");
        }
    }
}