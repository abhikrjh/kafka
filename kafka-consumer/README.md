# Kafka Consumer Project

This project demonstrates a simple Kafka consumer implemented in Spring Boot. The consumer listens to messages from a Kafka topic and logs the consumed messages. The consumer has 3 listeners that consume messages from the same topic concurrently.

## Overview

- **Kafka Topic**: The consumer listens to messages from a Kafka topic.
- **Consumers**: The project uses 3 consumers (`consumer1`, `consumer2`, and `consumer3`), each of which consumes messages from the same topic.
- **Technology Stack**:
    - Java
    - Spring Boot
    - Apache Kafka

## Features

- Listens to a Kafka topic and logs messages when consumed.
- Each listener (`consumer1`, `consumer2`, and `consumer3`) processes messages concurrently.
- Uses Spring Kafka to integrate with Apache Kafka.

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/abhikrjh/kafka.git
