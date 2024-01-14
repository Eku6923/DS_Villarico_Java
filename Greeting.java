/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.greeting;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {
    public static void main(String[]args){
        PriorityQueue<String> nNames = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the nickname of 4 of your classmates: ");
        
        for(int i = 0; i < 4; i++){
            nNames.add(input.nextLine());
        }
        System.out.println("Press H to say Hi to each of them.");
        
        String choice;
        while(!nNames.isEmpty()){
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("H")) {
                System.out.println("Hi " + nNames.poll());
            } else {
                System.out.println("Invalid input. Please press H to say Hi.");
            }
        }
        System.out.println("Done sating Hi");
    }
}
