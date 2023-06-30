# key_cloak_spring_boot

## Setup keycloak server

1. Run keycloak server
    ```shell
    cd keycloak
    docker-compose up -d
    ```
2. Setup Realm
3. Create Client
4. Create Role
5. Create User
6. Add credential and role to user

## Run Server

```shell
export PORT=8080
export KEY_CLOAK_BASE_URL=http://localhost:8080
./gradlew bootRun
```