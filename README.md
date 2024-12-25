# Kafka Producer and Consumer Implementation

This project demonstrates the integration of a Kafka producer and consumer using Spring Boot. The producer sends messages to a Kafka topic, while the consumer listens to and processes messages from the same topic. This setup simulates a typical messaging system with a producer-consumer architecture.

## Overview

- **Kafka Producer**: Sends 100,000 messages to a Kafka topic with 3 partitions. Each message is sent with a sequence number (`i`) to differentiate them.
- **Kafka Consumer**: Listens to the same Kafka topic with 3 consumers (`consumer1`, `consumer2`, `consumer3`). Each consumer logs the messages it consumes.
- **Kafka Topic**: The project uses a Kafka topic with 3 partitions and a replication factor of 1.
- **Resilience**: The project assumes a basic resilience factor of 1 for simplicity, meaning there is only one replica per partition.

## Technology Stack

- **Java**
- **Spring Boot**
- **Apache Kafka**
- **Lombok** (for logging and reducing boilerplate code)

## Features

- **Kafka Producer**:
  - Sends messages to a Kafka topic.
  - Customizable topic name and configurations via `application.yml`.
  - Sends 100,000 messages to the Kafka topic.

- **Kafka Consumer**:
  - Listens to messages from the Kafka topic.
  - Logs messages consumed from the topic.
  - Implements 3 consumers consuming messages concurrently.

## Installation

### 1. Clone the repository:
```bash
git clone https://github.com/abhikrjh/kafka.git
