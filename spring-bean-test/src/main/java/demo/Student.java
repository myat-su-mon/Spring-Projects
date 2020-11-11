package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name = "Myat Su Mon";

    private final Address address;

    public Student(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showStudentInfo(){
        return name + " : " + address.getStreetName();
    }

}
