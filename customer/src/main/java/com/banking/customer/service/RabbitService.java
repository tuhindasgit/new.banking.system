package com.banking.customer.service;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitService {

	// exchange will send the message through ROUTING_KEY to queue
	public static final String ROUTING_KEY = "audit-queue";
	public static final String ROUTING1_KEY = "audit1-queue";

	// queue will recieve the message and make it durable
	@Bean
	Queue queue() {
		return new Queue(ROUTING_KEY, true);
	}

	@Bean
	Queue newqueue() {
		return new Queue(ROUTING1_KEY, true);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange("spring-boot-exchange");

	}

/*	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(ROUTING1_KEY);*/
	
}
