FROM openjdk:8

LABEL maintainer=starrparker3@gmail.com
RUN mkdir -p /app
COPY . /app
WORKDIR /app

RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y vim
RUN mvn clean
RUN mvn package

# Need to get MYSQL install working
# RUN apt-get install -y mysql-server
# RUN apt-get install -y mysql-client
# RUN mysql -e MYSQL_ROOT_PASSWORD=nmp1026 -d mysql:9.3.0

CMD /bin/bash
# CMD java -jar target/restAPI-0.0.1-SNAPSHOT.jar