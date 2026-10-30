package com.imbrator.firstappspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstAppSpringBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(FirstAppSpringBootApplication.class, args);
        ImbratorComponent imbrator = context.getBean(ImbratorComponent.class);
        imbrator.deffinition();

    }

}
