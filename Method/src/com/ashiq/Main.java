package com.ashiq;

public class Main {

    // this is main method
    public static void main(String[] args) {


        calculateScore();


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScoreagain(gameOver, score, levelCompleted, bonus);
    }

    // Method for Calculate Score without parameter passing

    public static void calculateScore() {
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


    }

    // Method for Calculate Score without parameter passing

    public static void calculateScoreagain(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalScore = score + (levelCompleted * 5);
            finalScore += 3000;

            System.out.println("Your final Score is " + finalScore);
        }


    }
}
