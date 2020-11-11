package qualifier;

import org.springframework.stereotype.Component;

@Component
//@Component(value = "yoyeyo")
public class SingYoYeYoQuest implements Quest{
    public String goQuest(){
        return "Knight Sing 'Yo Ye Yo' happily";
    }

}
