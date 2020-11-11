package qualifier;

import org.springframework.stereotype.Component;

@Dragon
@Component
//@Component(value = "dragon")
public class SkyDragonQuest implements Quest{
    public String goQuest(){
        return "Knight killed the dragon";
    }
}
