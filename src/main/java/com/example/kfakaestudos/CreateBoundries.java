package com.example.kfakaestudos;

import com.google.protobuf.Message;
import com.kafkaestudos.proto.Boundries;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
@RequiredArgsConstructor
public class CreateBoundries {

   /* private  static  final KafkaProducer<String, Boundries> producer  =   new Producer().getProducer();
    //kafka template

    public void create() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        com.kafkaestudos.proto.Boundries boundries = com.kafkaestudos.proto.Boundries.newBuilder().build();

        boundries.toBuilder().setId(1);
        boundries.toBuilder().setIdUser(1);
        boundries.toBuilder().build();

        producer.send(new ProducerRecord("boundries", "1", boundries));

    }*/
}