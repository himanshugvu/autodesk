# AutoDesk app

## Project Demo URL
https://autodeskapp.herokuapp.com/

## Project Demo Video
https://github.com/himanshusgvu/autodesk/blob/master/FinalDemo.mp4

## 1) Backend App - Spring Boot

### Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

### Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.autodesk.RestAppApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn clean install
```

```shell
mvn spring-boot:run
```

## 2) Frontend App - React

### Running the application locally

Use the below command to run the react app. This will start the react app on port 3000

```shell
npm start
```

Use the below command to run the build from the `package.json` scripts field

```shell
npm run build
```
