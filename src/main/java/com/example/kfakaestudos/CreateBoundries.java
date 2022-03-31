package com.example.kfakaestudos;

import com.google.protobuf.Message;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import java.lang.reflect.InvocationTargetException;

public class CreateBoundries {

    private  static  final KafkaProducer<String, Message> producer  =   new Producer().getProducer();

    public void create() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        com.kafkaestudos.proto.Boundries boundries = com.kafkaestudos.proto.Boundries.newBuilder().build();

        boundries.toBuilder().setId(1);
        boundries.toBuilder().setIdUser(1);
        boundries.toBuilder().build();

        producer.send(new ProducerRecord("boundries", "1", boundries));

    }
}
