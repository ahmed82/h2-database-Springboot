FROM openjdk:8-jre-alpine
RUN rm -rf e:\usr\local\tomcat\webapps\*
COPY ./target/docker-spring-h2db.war E:\docker-spring-h2db.war
ADD target/docker-spring-h2db.war docker-spring-h2db.war
ENV myName Ahmed
EXPOSE 8085
CMD ["java", "-jar", "docker-spring-h2db.war"]