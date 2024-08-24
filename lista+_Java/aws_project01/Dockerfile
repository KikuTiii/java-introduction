FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY build/libs/curso_aws_project01-1.0.0.jar /app.jar
ENTRYPOINT ["java", "-cp", "/app.jar", "br.com.mkikuti.aws_project01.AwsProject01Application"]
