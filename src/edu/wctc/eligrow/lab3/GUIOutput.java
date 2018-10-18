package edu.wctc.eligrow.lab3;

import javax.swing.*;

public class GUIOutput {

    public void getOutput(IOutput output){
        JOptionPane.showMessageDialog(null, output.toString());
    }

}
