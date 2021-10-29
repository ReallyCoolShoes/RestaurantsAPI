

To run the application from the command line: /mvnw spring-boot:run

To debug:
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"
Add the Remote JVM Debug Configuration with arguments: -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
Debug with the Remote Debug Configuration

To view the H2 console:
- http://localhost:8080/h2
- Change JDBC url to jdbc:h2:mem:testdb
- Connect


