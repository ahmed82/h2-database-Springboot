Spring Boot
inMemorey Database H2

https://start.spring.io/

---------------------------------
 Accessing the H2 Console:
 http://localhost:8080/h2-console
 
 ----------------------------------
 Docker build:
 	docker build -t docker-spring-h2db .
 Docker Run and Push:
 	docker run -p 8085:8085 docker-spring-h2db
 	
 --------------------------------------
 
 To Run the New 10-2019 Actuator:
 $ curl localhost:9001/actuator/health
 --------------------------------------- 