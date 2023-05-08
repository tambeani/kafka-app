# kafka-app
kafka-app

This repository began as a means for learning Kafka in conjunction with the Spring framework.

We begin by adding dependency for Kafka support by Spring - `spring-kafka`

```
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
    <version>3.0.0</version>
</dependency>
```

## Create topics programmatically

We can create topics using kafka scripts through command-line tools, however in this context we want to create topics programmatically. For this we take advantage of `AdminClient`, `KafkaAdmin` and `NewTopic`, to create topics automatically.