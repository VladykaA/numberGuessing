package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute(){
        view.print(View.WELCOME);
        view.print(View.RANGE_DETERMINATION);
        Scanner sc = new Scanner(System.in);
        guessedNumberRange(sc);
        view.print(View.LETS_THE_GAME_BEGIN);
        checkingRun(sc);

    }

    public void guessedNumberRange(Scanner sc){
        if (model.determinationChoice(sc.next())){
            view.print(View.POSITIVE_DETERMINATION_RESULT_FROM);
            model.setNumberFrom(sc.nextInt());
            view.print(View.POSITIVE_DETERMINATION_RESULT_TO);
            model.setNumberTo(sc.nextInt());
            model.setGuessedNumber(model.rand(model.getNumberFrom(), model.getNumberTo()));
        }else {
            view.print(View.NEGATIVE_DETERMINATION_RESULT);
            model.setGuessedNumber(model.rand());
        }
    }

    public void checkingRun(Scanner sc){
        while (sc.hasNext()){
            int number = sc.nextInt();
            if (number != model.getGuessedNumber()){
                if (model.greaterLowerNumberCheck(number, model.getGuessedNumber())){
                    view.print(View.UPPER_WRONG_ANSWER);
                }else {
                    view.print(View.LOWER_WRONG_ANSWER);
                }
                model.answersStoring(number);
            }else {
                view.print(View.RIGHT_ANSWER);
                view.print(View.ANSWER + number);
                view.print(View.THE_RANGE_FROM + model.getNumberFrom() + View.THE_RANGE_TO + model.getNumberTo());
                view.print(View.ATTEMPTS);
                view.printArray(model.getAnswers());
                break;
            }
            sc.next();
        }
    }
}
