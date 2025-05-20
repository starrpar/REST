#Dockerfile - build java .jar file
#Dockerfile - copy .jar file to /app folder and execute (java -jar ...)

docker build . -t local_repo:hr_benefits_agent
docker images
docker run -it local_repo:hr_benefits_agent

