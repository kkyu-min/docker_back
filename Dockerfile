FROM java:17
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=themint-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
ENV TZ=Asia/Seoul
RUN apt-get install -y tzdata