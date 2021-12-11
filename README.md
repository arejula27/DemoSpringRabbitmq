# DemoSpringRabbitmq

Es necesario tener rabbit mq corriendo en localhost

PAra lanzar el proyecto se debe de costruir con 
```bash
./gradlew build
java -jar build/libs/RabbitmqDemo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver
java -jar build/libs/RabbitmqDemo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender
```
