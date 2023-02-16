# Latest alpine linux
#FROM alpine:latest
FROM openjdk:19-alpine
MAINTAINER Narayana Basetty
# Install Open JDK 17
#RUN apk --no-cache add openjdk17 --repository=http://dl-cdn.alpinelinux.org/alpine/edge/community
# Check JDK version
RUN java -version
# Env app directory
ENV APP_DIR=/app
# app directory
RUN mkdir -p $APP_DIR
# copy app jar to app directory
COPY ../target/sampleapp-0.0.1-SNAPSHOT.jar $APP_DIR
# workdir
WORKDIR /app
# Run the jar
ENTRYPOINT ["java", "-jar", "sampleapp-0.0.1-SNAPSHOT.jar"]
