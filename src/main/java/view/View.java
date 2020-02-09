package view;

import java.util.List;

public class View {

    public void print(String msg) {
        System.out.println(msg);
    }

    public void printList(List<Integer> answers) {
        answers.forEach(num -> System.out.print(num + "\t"));
    }

}
