package com.example.kfakaestudos;

import com.google.protobuf.Message;
import com.kafkaestudos.proto.Users;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.stereotype.Service;


import java.lang.reflect.InvocationTargetException;


public class CreateUser {

    private  static  final KafkaProducer<String, Users> producer  =   new Producer().getProducer();

    public void create() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        com.kafkaestudos.proto.Users user = com.kafkaestudos.proto.Users.newBuilder().build();

        user.toBuilder().setId(1);
        user.toBuilder().setEmail("julianasouzamelo@live.com");
        user.toBuilder().build();

        producer.send(new ProducerRecord("new-user", "1", user));

    }
}
