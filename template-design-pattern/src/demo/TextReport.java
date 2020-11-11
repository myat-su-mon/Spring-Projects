package demo;

public class TextReport extends AbstractReport {
    @Override
    void appendHeader() {
        System.out.println("Appending Txt Header:");
    }

    @Override
    void appendText() {
        System.out.println("Appending Txt Text:");
    }

    @Override
    void appendFooter() {
        System.out.println("Appending Txt Footer:");
    }
}
