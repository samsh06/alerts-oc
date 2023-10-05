package com.safetynet.alerts.config;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TraceConfig {

    @Bean
    public HttpExchangeRepository htttpTraceRepository() {
        return new InMemoryHttpExchangeRepository();
    }

}