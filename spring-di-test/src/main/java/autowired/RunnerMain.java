package autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
    }
}
