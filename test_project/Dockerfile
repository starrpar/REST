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
RUN apt-get install -y default-mysql-server
RUN apt-get install -y default-mysql-client

# NOTE: need to come up with a way of starting mysql/mariadb...
RUN /bin/bash -c "src/main/resources/start_mariadb.sh"

# ...then the following shell scripts will enable DB mydb
# RUN /bin/bash -c "src/main/resources/update_db.sh"
# RUN /bin/bash -c "src/main/resources/verify_db_changes.sh"

# can use the following to undo the changes for rerunning/debugging...
# RUN /bin/bash -c "src/main/resources/undo_db_changes.sh"

# using /bin/bash to investigate while still developing
CMD /bin/bash
# ...once not developing, instead execute jar file
# CMD java -jar target/restAPI-0.0.1-SNAPSHOT.jar