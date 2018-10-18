package edu.wctc.eligrow.lab3;

import java.util.ArrayList;
import java.util.Random;

public class Welcome implements IOutput, IInput{
    private Random rand = new Random();
    private ArrayList<String> hello = new ArrayList<>(){
        {
            add("Hello");
            add("Hola");
            add("Bonjour");
            add("Kon'nichiwa");
            add("Nǐ hǎo");
        }};

    @Override
    public String toString(){
        int randNum = rand.nextInt(hello.size());
        return hello.get(randNum);
    }

    @Override
    public void newText(String s) {
        hello.add(s);
    }
}
