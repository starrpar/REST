package com.parker.app.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	//ToDo: figure out how to use this here to process streaming data

	/*
	@Bean
    public Function<KStream<Object, String>, KStream<?, WordCount>> process() {

        return input -> input
                .flatMapValues(value -> Arrays.asList(value.toLowerCase().split("\\W+")))
                .map((key, value) -> new KeyValue<>(value, value))
                .groupByKey(Serialized.with(Serdes.String(), Serdes.String()))
                .windowedBy(TimeWindows.of(5000))
                .count(Materialized.as("word-counts-state-store"))
                .toStream()
                .map((key, value) -> new KeyValue<>(key.key(), new WordCount(key.key(), value,
                        new Date(key.window().start()), new Date(key.window().end()))));
    }
	*/

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
