/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fruitbasket;

/**
 *
 * @author COMLAB101
 */
import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {

        Stack<String> basket = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int num_fruits;
        do {
            System.out.println("Enter the number of fruits to eat (1-4): ");
            num_fruits = sc.nextInt();
            sc.nextLine(); // Consume the remaining newline character

            if (num_fruits < 1 || num_fruits > 4) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (num_fruits < 1 || num_fruits > 4);

        for (int i = 1; i <= num_fruits; i++) {
            System.out.println("Enter A for Apple, O for Orange, M for Mango, and G for Guava: ");
            String fruit = sc.nextLine().toLowerCase();

            if (fruit.equals("a")) {
                basket.push("apple");
            } else if (fruit.equals("o")) {
                basket.push("orange");
            } else if (fruit.equals("m")) {
                basket.push("mango");
            } else if (fruit.equals("g")) {
                basket.push("guava");
            } else {
                System.out.println("Invalid input. Please try again.");
                i--;
            }
        }

        System.out.println("Your basket now has: " + basket);

        while (!basket.isEmpty()) {
            System.out.println("Press E to eat a fruit: ");
            String eat_fruit = sc.next().toLowerCase();

            if (eat_fruit.equals("e")) {
                basket.pop();
                System.out.println("Fruit(s) in the basket: " + basket);
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("No more fruits.");
    }
}