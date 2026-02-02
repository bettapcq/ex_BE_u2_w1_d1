package bettapiac.exu2w1d1;

import bettapiac.exu2w1d1.entities.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exu2w1d1Application {

    public static void main(String[] args) {
        SpringApplication.run(Exu2w1d1Application.class, args);
    }

    @Bean
    CommandLineRunner run(Menu menu) {
        return args -> menu.printMenu();
    }

}



