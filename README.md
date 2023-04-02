### Update AWS access key for reading message from SQS

1. Create a new AWS IAM user with permission to read message from SQS. For example, Add the following policy `AmazonSQSReadOnlyAccess` or `AmazonSQSFullAccess` to IAM user
2. Create access key for IAM user
3. Update access key and secret in `application.properties`

### Build & Run Docker image

1. Run `mvn clean install`
2. Extract jar file 
```
cd target/
java -Djarmode=layertools -jar .\mac-boot-sqs-consumer-0.0.1-SNAPSHOT.jar extract
```
3. Build a docker image
```
docker build -t mac-boot-sqs-consumer:latest .
```
4. Run container 
```
docker run -d -p 8080:8080 --name mac-boot-sqs-consumer mac-boot-sqs-consumer
```
5. View log 
```
docker logs -f mac-boot-sqs-consumer
```
