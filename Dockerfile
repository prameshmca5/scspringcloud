FROM tomcat:8.5.47-jdk8-openjdk
EXPOSE 8080
MAINTAINER "Ramesh Pongiannan rameshkp2@gmail.com"
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/scspringcloud-0.0.1-SNAPSHOT.war  /usr/local/tomcat/webapps//ROOT.war
CMD ["catalina.sh", "run"]