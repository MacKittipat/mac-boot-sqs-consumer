package com.mackittipat.macbootsqsconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QueueListener {

    @JmsListener(destination = "mac-queue")
    public void queueListener(String message) {
        log.info("Receiving message : {}", message);
    }
}
