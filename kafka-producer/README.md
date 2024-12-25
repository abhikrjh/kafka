# Kafka Producer Implementation

This project demonstrates a simple Kafka producer implemented in Spring Boot that sends messages to a Kafka topic. The producer sends 100,000 messages to the specified topic, which has 3 partitions, with a resilience factor of 1.

## Overview

- **Kafka Topic**: The messages are sent to a Kafka topic with 3 partitions.
- **Resilience Factor**: Set to 1, meaning that there is only one replica for each partition, ensuring minimal fault tolerance.
- **Technology Stack**:
    - Java
    - Spring Boot
    - Apache Kafka

## Features

- Sends messages to a Kafka topic.
- Uses Spring Kafka to integrate with Apache Kafka.
- The topic name and other configurations can be customized via application properties.

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/abhikrjh/kafka.git
