  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.friendlyadditionquiz;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FriendlyAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int correctAnswer = number1 + number2;
        int userAnswer;

        System.out.println("Hey there! Let's practice some addition.");
        System.out.println("Try to answer the question below:");

        do {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("🎉 Awesome! That's correct!");
            } else {
                System.out.println("Oops, not quite. Give it another shot!");
            }
        } while (userAnswer != correctAnswer);

        System.out.println("Thanks for playing! Keep up the good work! 😊");
        input.close();
    }
}