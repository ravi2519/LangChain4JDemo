# Demo Application to use locally deplyed Deep Seek model using Ollama

## Before running the application:
- Install [Ollama](https://ollama.com/)
- Run [DeepSeek](https://ollama.com/library/deepseek-r1) model

## Running and using the demo 
-  `mvn clean install` 
-  `mvn spring-boot:run` 
- Call the Assistant endpoint as follow:

 ```   
  curl --location --request GET 'http://localhost:8080/assistant' \
  --form 'message="Which is the tallest mountain on earth?"'
 
 ```   
