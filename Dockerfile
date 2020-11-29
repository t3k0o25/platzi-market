FROM openjdk:11-jre-slim
EXPOSE 8091
ADD build/libs/platzi-market-0.0.1-SNAPSHOT.jar platzimarket.jar
ENTRYPOINT ["java","-jar","/platzimarket.jar"]