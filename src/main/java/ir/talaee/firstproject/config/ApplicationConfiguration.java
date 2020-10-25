package ir.talaee.firstproject.config;

import ir.talaee.firstproject.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "countryBean")
    public Country getCountry() {
        return new Country("Iran");
    }
}
