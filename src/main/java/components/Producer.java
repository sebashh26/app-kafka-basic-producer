package components;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {

    private KafkaProducer<String, String> producer;

    public Producer() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");//msn y key se envia en la red y se almacenan en ficheros por eso debe serializarse
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("acks", "all");

        producer = new KafkaProducer<>(props);

    }

    public void send(String topic, String message) {
        producer.send(new ProducerRecord<>(topic, message));
    }

    public void close() {
        producer.close();
    }



}










