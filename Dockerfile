FROM openjdk:17
EXPOSE 8081
ADD target/githubactions.jar githubactions.jar
ENTRYPOINT ["java","-jar","/githubactions.jar"]