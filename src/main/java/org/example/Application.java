package org.example;

import org.example.entity.Cliententity;
import org.example.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.Date;


@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts
// @ComponentScan(basePackages = "org.example.controller")

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository sogebankRepository) {
        return args -> {
            sogebankRepository.save(Cliententity.builder().id(1)
                    .nomClient("andou with postgrest new").compte(657.87).age(45).date(new Date())
                    .build());
            sogebankRepository.save(Cliententity.builder().id(2)
                    .nomClient("peter with postgrest new").compte(657.87).age(45).date(new Date())
                    .build());
            sogebankRepository.save(Cliententity.builder().id(3)
                    .nomClient("arnold with hpostgrest new").compte(657.87).age(45).date(new Date())
                    .build());


        };
    }
}