FROM eclipse-temurin:17
COPY target/Devproduct.jar Devproduct.jar
CMD [ "java","-jar","Devproduct.jar" ]