package com.besafx.app.switchdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SwitchDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwitchDatasourceApplication.class, args);
    }

}
