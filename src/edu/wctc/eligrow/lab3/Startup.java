package edu.wctc.eligrow.lab3;

public class Startup {
    public static void main(String[] args) {

        IOutput outFile = new File();
        IOutput outWelcome = new Welcome();

        IInput inFile = new File();
        IInput inWelcome = new Welcome();

        GUIInput guiInput = new GUIInput();
        ConsoleInput consoleInput = new ConsoleInput();

        GUIOutput guiOutput = new GUIOutput();
        ConsoleOutput consoleOutput = new ConsoleOutput();

        guiOutput.getOutput(outFile);
        guiOutput.getOutput(outWelcome);

        guiInput.newText(inFile);
        guiInput.newText(inWelcome);

        consoleOutput.getOutput(outFile);
        consoleOutput.getOutput(outWelcome);

        consoleInput.newText(inFile);
        consoleInput.newText(inWelcome);

    }
}
