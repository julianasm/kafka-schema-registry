package com.example.kfakaestudos;

import com.google.protobuf.Message;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KfakaEstudosApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfakaEstudosApplication.class, args);

        try {
            new CreateBoundries().create();
        } catch (Exception e){e.printStackTrace();
        }
    }


  /*  CommandLineRunner commandLineRunner(KafkaTemplate<String, Message> kafkaTemplate){
  //      com.kafkaestudos.proto.Boundries boundries = com.kafkaestudos.proto.Boundries.newBuilder().build();
 //       return args -> {
  //          kafkaTemplate.send("boundries", boundries);
   //     };
    } */


}
