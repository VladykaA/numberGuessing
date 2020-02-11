package controller;

import javafx.beans.binding.When;
import model.Model;
import view.View;

import java.util.Scanner;

import static util.ConstantsUtil.*;

public class Controller {

    public static final Scanner SCANNER = new Scanner(System.in);

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        view.print(WELCOME);
        guessedNumberRange();
        checkingRun();
    }

    public void guessedNumberRange() {
        model.establishingGuessedNumber();
    }

    public void checkingRun() {
        while (true) {
            int number;
            while (!SCANNER.hasNextInt()) {
                view.print(WRONG_INPUT);
                SCANNER.next();
            }
            number = SCANNER.nextInt();
            if (number == model.getGuessedNumber()) {
                view.print(RIGHT_ANSWER + "\n" +
                        ANSWER + number + "\n" +
                        ATTEMPTS);
                view.printList(model.getAnswers());
                break;
            }
            printClueAboutGreaterOrLowerNumber(number);
            model.answersStoring(number);
        }
    }


    private boolean isInteger(String num) {
        if (!num.matches("-?(0|[1-9]\\d*)")) {
            view.print(WRONG_INPUT);
            return false;
        }
        return true;
    }

    private void printClueAboutGreaterOrLowerNumber(int number) {
        if (number < model.getGuessedNumber() && number > model.getNumberFrom()) {
            model.setNumberFrom(number);
        } else if (number > model.getGuessedNumber() && number < model.getNumberTo()) {
            model.setNumberTo(number);
        }
        view.print(WRONG_ANSWER + " "
                + THE_RANGE_FROM
                + model.getNumberFrom()
                + " - "
                + model.getNumberTo()
                + THE_RANGE_TO);
    }
}
