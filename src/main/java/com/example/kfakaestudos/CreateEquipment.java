package com.example.kfakaestudos;

import com.google.protobuf.Message;
import com.kafkaestudos.proto.Equipment;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.lang.reflect.InvocationTargetException;

public class CreateEquipment {

    private  static  final KafkaProducer<String, Message> producer  =   new Producer().getProducer();

    public void create() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        com.kafkaestudos.proto.Equipment equipment = com.kafkaestudos.proto.Equipment.newBuilder().build();

        equipment.toBuilder().setId("1");
        equipment.toBuilder().setDescription("teste");
        equipment.toBuilder().build();

        if (!equipment.getId().equals("1"))
            producer.send(new ProducerRecord("topic_equipment_kafka", equipment.getId(), equipment));
        else
            producer.send(new ProducerRecord("topic_equipment_kafka", equipment.getId(), null));

    }

}
