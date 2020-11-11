package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("bean.xml");

        Student student = context.getBean("student", Student.class);

        System.out.println(student.showStudentInfo());

        ((FileSystemXmlApplicationContext)(context)).close();
    }

}
