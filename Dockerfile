FROM java:8
MAINTAINER GavinYau <GavinYau1995@outlook.com>
WORKDIR /
COPY target/HelloWorld.jar /HelloWorld.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/HelloWorld.jar"]