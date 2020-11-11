package demo;

import java.nio.file.Paths;

public class Runner {
    public static void main(String[] args) {
        new PdfReport().generateReport(Paths.get("report.pdf"),"report.pdf");
        new TextReport().generateReport(Paths.get("report.txt"), "report.txt");
    }
}
