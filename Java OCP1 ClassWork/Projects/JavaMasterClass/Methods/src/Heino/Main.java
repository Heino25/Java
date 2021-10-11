package Heino;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // storing arguments inside the method being called below.
        calculatedScore(true,800,levelCompleted,bonus);
        calculatedScore(true,10000,8,200);

    }
                                        //assigning parameters in method below
    public static  void calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
