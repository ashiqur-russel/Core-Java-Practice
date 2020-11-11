package com.ashiq;

public class Main {
    /**
     * @param args Create Method called displacHighScorePosition
     *             it should be players name as parameter,ans a 2nd parameter as a position as a position in the high score table
     *             should display the players name along with message like " managed to get into position " and
     *             the position they got and further message " on the hoigh scorew table
     *             <p>
     *             Create 2nd method called calculateHighScorePosition
     *             it should be sent one argument only, the player name
     *             it should return an int
     *             the return should be
     *             1 if the score is >1000
     *             2 if the score is >500 and <1000
     *             3 if the score is >100 and <500
     *             4 in all other cases
     *             call both methos and display the result of following
     *             a score of 1500, 900, 400, 50
     */

    // Main method
    public static void main(String[] args) {
        int score;


        score = 1000;
        String playerName = "Salah";
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 900;
        playerName = "Figo";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 400;
        playerName = "Messi";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 40;
        playerName = "Ronaldo";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);


    }


    // Method for calculate high score position

    public static int calculateHighScorePosition(int score) {


        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }

    }

    // Method for display high score position

    public static void displayHighScorePosition(String playerName, int position) {

        //return playerName +" Managed to get into position "+ position +" on the high score table";

        System.out.println(playerName + " Managed to get into position " + position + " on the high score table");
    }
}
