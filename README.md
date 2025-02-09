# Apache-Kafka-Producer-Spring-Boot

# Start the Zoo Keeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start the Kafka Server
.\bin\windows\kafka-server-start.bat .\config\server.properties

# To Create the topic 
.\bin\windows\kafka-topics.bat --create --topic helloTopic --bootstrap-server localhost:9092

# To read the events
.\bin\windows\kafka-console-consumer.bat --topic helloTopic --from-beginning --bootstrap-server localhost:9092

![image](https://github.com/user-attachments/assets/21447392-5765-4225-9a14-6c5502219359)
![image](https://github.com/user-attachments/assets/98ecb7f0-3a85-45a5-8a6b-14b5bf506e60)
![image](https://github.com/user-attachments/assets/d24f162d-144c-405b-a0c6-7b10abba48a0)
![image](https://github.com/user-attachments/assets/7a20b606-d355-43c9-a5f8-1f1394db5d97)

