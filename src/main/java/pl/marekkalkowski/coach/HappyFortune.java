package pl.marekkalkowski.coach;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

    @Bean("zzzzzzzzz")
    private Coach coach(){
        return new TennisCoach();
    }

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day";
    }

}
