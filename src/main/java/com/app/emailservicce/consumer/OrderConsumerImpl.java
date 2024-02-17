package com.app.emailservicce.consumer;

import com.app.emailservicce.event.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderConsumerImpl {

    @KafkaListener(
            topics = "${stock-service-consumer.topic-name}",
            groupId = "${stock-service-consumer.group-id}")
    public void consume(ConsumerRecord<String, OrderEvent> record)
    {
        System.err.println(record.value());

    }
}
