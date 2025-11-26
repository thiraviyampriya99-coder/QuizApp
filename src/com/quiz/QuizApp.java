package com.quiz;
import java.util.ArrayList;
import java.util.Scanner;

class Question {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    Question(String q, String a, String b, String c, String d, char correct) {
        question = q;
        optionA = a;
        optionB = b;
        optionC = c;
        optionD = d;
        correctAnswer = correct;
    }
}
public class QuizApp {
	public static void main(String[] args) {

        ArrayList<Question> quiz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding Questions
        quiz.add(new Question(
                "1. What is the size of int in Java?",
                "A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends on OS",
                'B'));

        quiz.add(new Question(
                "2. Who invented Java?",
                "A. James Gosling", "B. Dennis Ritchie", "C. Guido van Rossum", "D. Bjarne Stroustrup",
                'A'));

        quiz.add(new Question(
                "3. Which keyword is used to inherit a class?",
                "A. implement", "B. inherit", "C. extends", "D. using",
                'C'));

        int score = 0;

        System.out.println("===== ONLINE QUIZ APP =====\n");

        // Loop through questions
        for (Question q : quiz) {
            System.out.println(q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("Your Answer: ");
            char ans = sc.next().toUpperCase().charAt(0);

            if (ans == q.correctAnswer) {
                System.out.println("✔ Correct!\n");
                score++;
            } else {
                System.out.println("✘ Wrong! Correct Answer is: " + q.correctAnswer + "\n");
            }
        }

        System.out.println("===== QUIZ FINISHED =====");
        System.out.println("Your Score: " + score + "/" + quiz.size());

        sc.close();
    }
}


