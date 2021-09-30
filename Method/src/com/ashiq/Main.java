package com.ashiq;

public class Main {

    // this is main method
    public static void main(String[] args) {


        int scoreResult = calculateScore();
        System.out.println("Final Score is : " + scoreResult);


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScoreagain(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score is : " + highScore);

    }

    // Method for Calculate Score without parameter passing

    public static int calculateScore() {
        //int finalScore = 0;
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * 5);
            finalScore += 2000;

            System.out.println("Your final Score is " + finalScore);
        }
        return -1;


    }

    // Method for Calculate Score without parameter passing

    public static int calculateScoreagain(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * 5);
            finalScore += 3000;

        }

        return -1;


    }
}
