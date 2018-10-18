package edu.wctc.eligrow.lab3;

public class File implements IOutput, IInput {
    private final String FILE_NAME = "file.txt";

    @Override
    public String toString(){
        String output = "";

        FileRead fileInput = new FileRead(FILE_NAME);

        output = fileInput.fileRead();

        fileInput.fileClose();

        return output;

    }

    @Override
    public void newText(String s) {
        FileWrite fileOutput = new FileWrite(FILE_NAME);

        fileOutput.fileWrite(s);

        fileOutput.fileClose();

    }
}
