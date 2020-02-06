package model;

import java.util.ArrayList;
import java.util.Random;

public class Model {
    private Random random;
    private int guessedNumber;
    private int numberFrom;
    private int numberTo;
    private ArrayList<Integer> answers = new ArrayList<>();
    private final int MAX = 100;
    private final int MIN = 0;

    public boolean determinationChoice(String choice) {
        return choice.equals("yes".toLowerCase());
    }

    public int rand(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("max cannot be lower min");
        }
        random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int rand() {
        random = new Random();
        return random.nextInt((MAX - MIN) + 1) + MIN;
    }

    public void answersStoring(int number){
        answers.add(number);
    }

    public boolean greaterLowerNumberCheck(int number, int guessedNumber){
        return number > guessedNumber;
    }

    public ArrayList<Integer> getAnswers() {
        return answers;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public int getNumberFrom() {
        return numberFrom;
    }

    public void setNumberFrom(int numberFrom) {
        this.numberFrom = numberFrom;
    }

    public int getNumberTo() {
        return numberTo;
    }

    public void setNumberTo(int numberTo) {
        this.numberTo = numberTo;
    }
}
