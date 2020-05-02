FROM java:8
WORKDIR /
ADD hw-assignment.jar hw-assignment.jar
EXPOSE 8080
CMD java -jar hw-assignment.jar

