FROM gradle

WORKDIR app
COPY . .
RUN ls
RUN ./gradlew bootJar

ENV PORT=8080
ENV KEY_CLOAK_BASE_URL=keycloak

ENTRYPOINT java -jar -Dserver.port=$PORT ./build/libs/keycloak_demo-0.0.1-SNAPSHOT.jar