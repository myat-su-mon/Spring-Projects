package demo;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String streetName = "Anawyahtar Road";

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
