package ir.talaee.firstproject.test;

import ir.talaee.firstproject.config.ApplicationConfiguration;
import ir.talaee.firstproject.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryController {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country country = (Country) appContext.getBean("countryBean");

        System.out.println(country.getName());

    }
}
