package pl.marekkalkowski.coach;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class UnHappyFortune implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Today is siet day!!";
    }
}
