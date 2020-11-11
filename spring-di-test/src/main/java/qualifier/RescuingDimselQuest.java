package qualifier;

import org.springframework.stereotype.Component;

@Component
//@Component(value = "dimsel")
public class RescuingDimselQuest implements Quest{
    public String goQuest(){
        return "Knight is going to rescue the Dimsel";
    }
}
