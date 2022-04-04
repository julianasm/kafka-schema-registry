package com.example.kfakaestudos;

import com.google.protobuf.Message;
import com.kafkaestudos.proto.Users;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;

public class Producer {

    private KafkaProducer<String, Users> producer = null;

    public Producer() {
        // create Producer properties
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:19092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer.class);
        props.put("schema.registry.url", "http://localhost:8085");
        props.setProperty(ProducerConfig.ACKS_CONFIG, "1");
        props.setProperty(ProducerConfig.RETRIES_CONFIG, Integer.toString(Integer.MAX_VALUE));
        props.setProperty(ProducerConfig.RETRY_BACKOFF_MS_CONFIG,"3000");
        props.setProperty(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");
        props.setProperty(ProducerConfig.LINGER_MS_CONFIG, "300");
        props.setProperty(ProducerConfig.BATCH_SIZE_CONFIG, Integer.toString(256 * 1024));

        this.producer = new KafkaProducer<>(props);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            producer.close();
        }));
    }

    public KafkaProducer<String, Users> getProducer() {
        return this.producer;
    }
}
