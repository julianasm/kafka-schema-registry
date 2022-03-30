package com.example.kfakaestudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KfakaEstudosApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfakaEstudosApplication.class, args);

        try {
            new CreateEquipment().create();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
