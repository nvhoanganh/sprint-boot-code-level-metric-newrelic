# Run the app using VSCode

```bash
./mvnw spring-boot:run
```

# build

```bash
# install maven
brew install maven

# build
mvn -B -DskipTests package --file pom.xml

# build docker image
docker buildx build . --platform linux/amd64 -t anthonynguyen334/springboot-simple --progress=plain

# tag
docker tag anthonynguyen334/springboot-simple anthonynguyen334/springboot-simple:latest

# push
docker push anthonynguyen334/springboot-simple:latest
```
