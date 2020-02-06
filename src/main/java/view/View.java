package view;

import java.util.ArrayList;

public class View {

    public static final String WELCOME = "I want to play a game.";
    public static final String RANGE_DETERMINATION =
            "Do you want to determine a number range for the number proposition?";
    public static final String NEGATIVE_DETERMINATION_RESULT =
            "Well, your choice not to select the range. So, it will from 0 to 100.";
    public static final String POSITIVE_DETERMINATION_RESULT_FROM = "Good, select the number form";
    public static final String POSITIVE_DETERMINATION_RESULT_TO = "Nice, now select the number to";
    public static final String LETS_THE_GAME_BEGIN = "Let's start the game! Good luck.";
    public static final String LOWER_WRONG_ANSWER = "You failed. The number is greater. Try again.";
    public static final String UPPER_WRONG_ANSWER = "You failed. The number is lower. Try again.";
    public static final String RIGHT_ANSWER = "Excellent! You win";
    public static final String ANSWER = "The correct number is: ";
    public static final String ATTEMPTS = "Your answers: ";
    public static final String THE_RANGE_FROM = "The range was form  ";
    public static final String THE_RANGE_TO = " to ";


    public void print(String msg) {
        System.out.println(msg);
    }

    public void printArray(ArrayList<Integer> answers) {
        answers.forEach(num -> System.out.print(num + " "));
    }

}
