package edu.wctc.eligrow.lab3;

import javax.swing.*;

public class GUIInput {

    public void newText(IInput input){
        String text = JOptionPane.showInputDialog(null, "Enter data to input");

        input.newText(text);
    }

}
