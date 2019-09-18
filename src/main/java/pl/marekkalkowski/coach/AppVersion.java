package pl.marekkalkowski.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppVersion {

    @Value("${version}")
    private String version;
    @Value("${build.date}")
    private String time;


    @Override
    public String toString() {
        return "AppVersion{" +
                "version='" + version + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
