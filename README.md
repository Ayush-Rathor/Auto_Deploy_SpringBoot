# Simple Spring Boot Math Application
This is a simple Spring Boot application that performs basic math operations (addition, subtraction, multiplication, and division).

## Endpoints
- `/add?a=10&b=5` - Adds two numbers
- `/subtract?a=10&b=5` - Subtracts the second number from the first
- `/multiply?a=10&b=5` - Multiplies two numbers
- `/divide?a=10&b=5` - Divides the first number by the second

### Build JAR
```
mvn clean package
```

### Build Docker Image
```
docker build -t mathapp .
```

### Run with Docker
```
docker run -p 8080:8080 mathapp
```

### Deploy to Kubernetes
```
kubectl apply -f deployment.yaml
