FROM openjdk:11
EXPOSE 8080
ADD target/kubernetes_Customer_App-0.0.1-SNAPSHOT.jar kubernetes_Customer_App-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kubernetes_Customer_App-0.0.1-SNAPSHOT.jar"]  