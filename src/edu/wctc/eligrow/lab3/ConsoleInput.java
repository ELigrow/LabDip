package edu.wctc.eligrow.lab3;
import java.util.Scanner;

public class ConsoleInput {
    private Scanner keyboard = new Scanner(System.in);

    public void newText(IInput input){
        System.out.print("Enter data to input: ");
        String text = keyboard.nextLine();

        input.newText(text);
    }

}
