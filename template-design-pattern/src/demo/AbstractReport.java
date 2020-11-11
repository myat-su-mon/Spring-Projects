package demo;

import java.nio.file.Path;

public abstract class AbstractReport {
    private void openFile(Path file){
        System.out.println("Opening File: " + file.toFile().getName());
    }

    public void generateReport(Path file, String text){
        openFile(file);
        appendHeader();
        appendText();
        appendFooter();
        closeFile();
    }
    abstract void appendHeader();
    abstract void appendText();
    abstract void appendFooter();

    private void closeFile(){
        System.out.println("Closing File: ");
    }
}
