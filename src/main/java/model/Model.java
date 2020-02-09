package model;

import java.util.ArrayList;
import java.util.List;
import static util.ConstantsUtil.*;

public class Model {

    private int guessedNumber;
    private int numberFrom = MIN;
    private int numberTo = MAX_VALUE;
    private List<Integer> answers;

    public Model() {
        answers = new ArrayList<>();
    }

    public void answersStoring(int number) {
        answers.add(number);
    }

    public boolean greaterLowerNumberCheck(int number) {
        return number > guessedNumber;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void establishingGuessedNumber() {
        this.guessedNumber = RANDOM.nextInt(MAX_VALUE) + MIN;
        System.out.println(guessedNumber);
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
