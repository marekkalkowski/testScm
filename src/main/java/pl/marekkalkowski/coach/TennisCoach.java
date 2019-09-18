package pl.marekkalkowski.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
    }

    @Autowired
    public TennisCoach(@Qualifier("unHappyFortune")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your bacjhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }


}
