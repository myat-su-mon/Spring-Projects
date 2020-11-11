package qualifier;

import org.springframework.stereotype.Component;

@Component
public class GreatMatrimonyQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight and Princess are going to perform the great matrimony.";
    }
}
