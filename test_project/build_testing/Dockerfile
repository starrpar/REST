FROM openjdk:8 AS buildstage
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

# CMD /bin/bash
CMD java -jar target/restAPI-0.0.1-SNAPSHOT.jar


# FROM openjdk:23
# LABEL maintainer=starrparker3@gmail.com
# RUN mkdir -p /app
# COPY . /app
# WORKDIR /app
# RUN ls -al /app

# CMD /bin/bash
# CMD java -jar restAPI-0.0.1-SNAPSHOT.jar