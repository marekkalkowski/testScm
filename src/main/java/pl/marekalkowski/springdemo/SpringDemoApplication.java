package pl.marekalkowski.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.marekkalkowski.coach.AppVersion;
import pl.marekkalkowski.coach.Coach;
import pl.marekkalkowski.coach.TennisCoach;

import java.util.Arrays;

@ComponentScan("pl.marekkalkowski.coach")
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDemoApplication.class, args);

		Coach coach = ctx.getBean("tennisCoach", TennisCoach.class);
		System.out.println(coach.getDailyFortune());

		Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println);

		Coach coach1 = ctx.getBean("zzzzzzzzz",Coach.class);
		System.out.println(coach1 + " !!coach");

		AppVersion appVersion = ctx.getBean("appVersion",AppVersion.class);
		System.out.println(appVersion);

	}

}
